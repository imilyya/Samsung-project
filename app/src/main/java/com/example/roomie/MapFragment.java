package com.example.roomie;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.Image;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraListener;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.maps.mobile.BuildConfig;
import com.yandex.runtime.image.ImageProvider;

import java.util.Objects;

public class MapFragment extends Fragment {
    private MapView mapView;
    private final String MAPKIT_API_KEY = "56a2e741-2a5e-4161-b91a-330d487700a7";

    public MapFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MapKitFactory.setLocale("ru_Ru");
        MapKitFactory.setApiKey(MAPKIT_API_KEY);
        MapKitFactory.initialize(this.requireContext());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_map, container, false);
    }

    @Override
    public  void onViewCreated(View view,  Bundle savedInstanceState){
        mapView = (MapView) view.findViewById(R.id.mapview);
    }

    @Override
    public void onStart() {
        super.onStart();
        MapKitFactory.getInstance().onStart();
        mapView.onStart();

        mapView.getMapWindow().getMap().move(
                new CameraPosition(new Point(55.670080, 37.480167),
                        16.0f, 0.0f, 0.0f),
                new Animation(Animation.Type.SMOOTH, 0),
                null
        );

        ImageProvider imageProvider;
        MapObjectCollection mapObjectCollection = mapView.getMapWindow().getMap().getMapObjects();
        PlacemarkMapObject placemarkMapObject = mapObjectCollection.addPlacemark(
                new Point(55.670080, 37.480167),
                ImageProvider.fromResource(this.requireContext(), R.drawable.baseline_pin_drop_24));
        placemarkMapObject.setOpacity(0.5f);
    }

    @Override
    public void onStop() {
        super.onStop();
        MapKitFactory.getInstance().onStop();
        mapView.onStop();
    }
}