package com.example.avik.mapbox;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;

import java.util.ArrayList;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback{

    private MapView mapView;
    private MapboxMap mapboxMap;
    private ArrayList<LatLng> latLongList;
    ArrayList<LatLongModel> latLongArrayList=new ArrayList<LatLongModel>();
    Marker marker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mapbox.getInstance(this, getString(R.string.access_token));
        setContentView(R.layout.activity_map);

        mapView = (MapView) findViewById(R.id.mapView2);
        setLatLong();
        mapView.onCreate(savedInstanceState);
    }

    private void setLatLong() {
        LatLongModel latLongModel = new LatLongModel();
        latLongModel.setTitle("Alabama");
        latLongModel.setSnippet("Hello,Ahmedabad");
        latLongModel.setLatitude("32.5961328");
        latLongModel.setLongitude("-88.9302534");
        latLongArrayList.add(latLongModel);


        latLongModel.setTitle("Alaska");
        latLongModel.setSnippet("Hello,Ahmedabad");
        latLongModel.setLatitude("60.0974965");
        latLongModel.setLongitude("-176.4694415");
        latLongArrayList.add(latLongModel);
    }

    @Override
    public void onMapReady(MapboxMap mapboxMap) {

        /////// Set Default Loacation ///////////
        mapboxMap.setCameraPosition(new CameraPosition.Builder()
                .target(new LatLng(40.0478325,-96.5954902)) /// (USA)
                .zoom(1)
                .build());

        for (int i = 0; i < latLongArrayList.size(); i++) {

            double latitude =Double.parseDouble(latLongArrayList.get(i).getLatitude());
            double longitude =Double.parseDouble(latLongArrayList.get(i).getLongitude());


            marker = mapboxMap.addMarker(new MarkerOptions()
                    .position(new LatLng(latitude,longitude))
                    .title(latLongArrayList.get(i).getTitle()));
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
