package com.example.avik.mapbox;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.Icon;
import com.mapbox.mapboxsdk.annotations.IconFactory;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerViewOptions;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MapView mapView;
    private ArrayList<LatLongModel> latLongArrayList;
    private Marker marker;
    private MapboxMap mapboxMap;
    private String zoomLevel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mapbox.getInstance(this, getString(R.string.mymaptoken));
        setContentView(R.layout.activity_main);

        mapView = (MapView) findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);



        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(final MapboxMap mapboxMap) {


                //mapboxMap.getUiSettings().setScrollGesturesEnabled(false);

//                double zoom = mapboxMap.getCameraPosition().zoom;
//                String zoomLevel = String.valueOf(zoom);
//                Toast.makeText(MainActivity.this, zoomLevel, Toast.LENGTH_SHORT).show();

//                IconFactory iconFactory = IconFactory.getInstance(MainActivity.this);
//                Icon icon = iconFactory.fromResource(R.drawable.ic_place_icon);
               // marker.setIcon(icon);

                /////// Set Default Loacation ///////////
                mapboxMap.setCameraPosition(new CameraPosition.Builder()
                        .target(new LatLng(40.0478325,-96.5954902)) /// (USA)
                        .zoom(1)
                        .build());

                mapboxMap.setOnCameraIdleListener(new MapboxMap.OnCameraIdleListener() {
                    @Override
                    public void onCameraIdle() {

                        double zoom = mapboxMap.getCameraPosition().zoom;
                        int zoooom = (int) zoom;
                        zoomLevel = String.valueOf(zoooom);
                       // Toast.makeText(MainActivity.this, zoomLevel, Toast.LENGTH_SHORT).show();

                        if (zoomLevel.equals("13")||zoomLevel.equals("1")||zoomLevel.equals("0")){
                            mapboxMap.getUiSettings().setScrollGesturesEnabled(false);
                        }
                        else{
                            mapboxMap.getUiSettings().setScrollGesturesEnabled(true);
                        }
                    }
                });




                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(32.5961328,-88.9302534))
                        .title("Alabama"));
                        //.snippet("Alabama"));
                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(60.0974965,-176.4694415))
                        .title("Alaska"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(34.1476975,-114.1803322))
                        .title("Arizona"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(34.7312452,-94.3807683))
                        .title("Arkansas"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(37.1864912,-123.7765241))
                        .title("California"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(38.9763407,-107.7996888))
                        .title("Colorado"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(41.5173924,-73.319332))
                        .title("Connecticut"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(39.318523,-75.507141))
                        .title("Delaware"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(38.897438,-77.026817))
                        .title("District of Columbia"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(27.766279,-81.686783))
                        .title("Florida"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(33.040619,-83.643074))
                        .title("Georgia"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(21.094318,-157.498337))
                        .title("Hawaii"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(44.240459,-114.478828))
                        .title("Idaho"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(40.349457,-88.986137))
                        .title("Illinois"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(39.849426,-86.258278))
                        .title("Indiana"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(42.011539,-93.210526))
                        .title("Iowa"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(38.526600,-96.726486))
                        .title("Kansas"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(37.668140,-84.670067))
                        .title("Kentucky"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(31.169546,-91.867805))
                        .title("Louisiana"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(44.693947,-69.381927))
                        .title("Maine"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(39.063946,-76.802101))
                        .title("Maryland"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(42.230171,-71.530106))
                        .title("Massachusetts"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(43.326618,-84.536095))
                        .title("Michigan"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(45.694454,-93.900192))
                        .title("Minnesota"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(32.741646,-89.678696))
                        .title("Mississippi"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(38.456085,-92.288368))
                        .title("Missouri"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(46.921925,-110.454353))
                        .title("Montana"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(41.125370,-98.268082))
                        .title("Nebraska"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(38.313515,-117.055374))
                        .title("Nevada"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(43.452492,-71.563896))
                        .title("New Hampshire"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(40.298904,-74.521011))
                        .title("New Jersey"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(34.840515,-106.248482))
                        .title("New Mexico"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(42.165726,-74.948051))
                        .title("New York"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(35.630066,-79.806419))
                        .title("North Carolina"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(47.528912,-99.784012))
                        .title("North Dakota"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(40.388783,-82.764915))
                        .title("Ohio"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(35.565342,-96.928917))
                        .title("Oklahoma"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(44.572021,-122.070938))
                        .title("Oregon"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(40.590752,-77.209755))
                        .title("Pennsylvania"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(41.680893,-71.511780))
                        .title("Rhode Island"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(33.856892,-80.945007))
                        .title("South Carolina"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(44.299782,-99.438828))
                        .title("South Dakota"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(35.747845,-86.692345))
                        .title("Tennessee"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(31.054487,-97.563461))
                        .title("Texas"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(40.150032,-111.862434))
                        .title("Utah"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(44.045876,-72.710686))
                        .title("Vermont"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(37.769337,-78.169968))
                        .title("Virginia"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(47.400902,-121.490494))
                        .title("Washington"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(38.491226,-80.954453))
                        .title("West Virginia"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(44.268543,-89.616508))
                        .title("Wisconsin"));

                mapboxMap.addMarker(new MarkerViewOptions()
                        .position(new LatLng(42.755966,-107.302490))
                        .title("Wyoming"));


                mapboxMap.setOnMarkerClickListener(new MapboxMap.OnMarkerClickListener() {
                    @Override
                    public boolean onMarkerClick(@NonNull Marker marker) {
                        Toast.makeText(MainActivity.this, marker.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });


                mapboxMap.setInfoWindowAdapter(new MapboxMap.InfoWindowAdapter() {
                    @Nullable
                    @Override
                    public View getInfoWindow(@NonNull Marker marker) {
                        View v = getLayoutInflater().inflate(R.layout.mapmarkartitlelayout, null);
                        String title = marker.getTitle();
                        TextView Tvtitle = v.findViewById(R.id.tv_title);
                        Tvtitle.setText(title);
                        return v;
                    }
                });

                mapboxMap.setOnInfoWindowClickListener(new MapboxMap.OnInfoWindowClickListener() {
                    @Override
                    public boolean onInfoWindowClick(@NonNull Marker marker) {

                        LatLng latLon = marker.getPosition();
                        String s = String.valueOf(latLon);
                        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();

                        return false;
                    }
                });


                mapboxMap.setOnMarkerClickListener(new MapboxMap.OnMarkerClickListener() {
                    @Override
                    public boolean onMarkerClick(@NonNull Marker marker) {
                        Toast.makeText(MainActivity.this,"YOU CLICKED ON "+marker.getTitle(),Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });


                mapboxMap.setOnMapClickListener(new MapboxMap.OnMapClickListener() {
                    @Override
                    public void onMapClick(@NonNull LatLng point) {

                        LatLngBounds latLngBounds = new LatLngBounds.Builder()
                                .include(new LatLng(32.6393,-117.004304))
                                .include(new LatLng(44.901184 ,-67.32254))
                                .build();

                        mapboxMap.easeCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, 50), 5000);
                    }
                });
            }
        });

    }


    // Add the mapView lifecycle to the activity's lifecycle methods
    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }
}
