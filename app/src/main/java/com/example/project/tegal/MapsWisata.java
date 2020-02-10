package com.example.project.tegal;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsWisata extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_wisata);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng wisata1 = new LatLng(-6.871546, 109.119191);
        mMap.addMarker(new MarkerOptions().position(wisata1).title("Rita Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wisata1));

        // Add a marker in Sydney and move the camera
        LatLng wisata2 = new LatLng(-7.198616, 109.164319);
        mMap.addMarker(new MarkerOptions().position(wisata2).title("Pemandian Air Panas Guci"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wisata2));

        // Add a marker in Sydney and move the camera
        LatLng wisata3 = new LatLng(-6.865498, 109.142164);
        mMap.addMarker(new MarkerOptions().position(wisata3).title("Taman Poci"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wisata3));

        // Add a marker in Sydney and move the camera
        LatLng wisata4 = new LatLng(-6.867347, 109.137531);
        mMap.addMarker(new MarkerOptions().position(wisata4).title("Alun Alun Tegal"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wisata4));
    }
}
