package com.anomdev.makutoanepal.ui.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.anomdev.makutoanepal.R
import com.anomdev.makutoanepal.databinding.FragmentMapBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*


class MapFragment : Fragment(), OnMapReadyCallback {

    private var _binding: FragmentMapBinding? = null
    private val binding get() = _binding!!

    private lateinit var map: GoogleMap


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMapBinding.inflate(inflater, container, false)


        //TODO:
        val mapFragment =
            childFragmentManager.findFragmentById(R.id.fragmentMap) as SupportMapFragment?  //use SuppoprtMapFragment for using in fragment instead of activity  MapFragment = activity   SupportMapFragment = fragment
        mapFragment!!.getMapAsync { mMap ->
            mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
            mMap.clear() //clear old markers


            onMapReady(mMap)

            val nepalZoom = CameraPosition.builder()
                .target(
                    LatLng(
                        getString(R.string.INIT_LAT).toDouble(),
                        getString(R.string.INIT_LNG).toDouble()
                    )
                )
                .zoom(6f)
                .bearing(0f)
                .tilt(45f)
                .build()

            mMap.animateCamera(CameraUpdateFactory.newCameraPosition(nepalZoom), 5000, null)


            mMap.addMarker(
                MarkerOptions()
                    .position(
                        LatLng(
                            getString(R.string.SWAYAMBHU_LAT).toDouble(),
                            getString(R.string.SWAYAMBHU_LNG).toDouble()
                        )
                    )
                    .title(getString(R.string.swayambhu))
                    .snippet(getString(R.string.swayambhu_snippet))
            )

            mMap.addMarker(
                MarkerOptions()
                    .position(
                        LatLng(
                            getString(R.string.BOUDHA_LAT).toDouble(),
                            getString(R.string.BOUDHA_LNG).toDouble()
                        )
                    )
                    .title(getString(R.string.boudha))
                    .snippet(getString(R.string.boudha_snippet))

            )

            mMap.addMarker(
                MarkerOptions()
                    .position(
                        LatLng(
                            getString(R.string.PASHU_LAT).toDouble(),
                            getString(R.string.PASHU_LNG).toDouble()
                        )
                    )
                    .title(getString(R.string.pashu))
                    .snippet(getString(R.string.pashu_snippet))
            )

            mMap.addMarker(
                MarkerOptions()
                    .position(
                        LatLng(
                            getString(R.string.CHITWAN_LAT).toDouble(),
                            getString(R.string.CHITWAN_LNG).toDouble()
                        )
                    )
                    .title(getString(R.string.chitwan))
                    .snippet(getString(R.string.chitwan_snippet))
            )

            mMap.addMarker(
                MarkerOptions()
                    .position(
                        LatLng(
                            getString(R.string.LUMBINI_LAT).toDouble(),
                            getString(R.string.LUMBINI_LNG).toDouble()
                        )
                    )
                    .title(getString(R.string.lumbini))
                    .snippet(getString(R.string.lumbini_snippet))
            )

            //TREKKINGS
            mMap.addMarker(
                MarkerOptions()
                    .position(
                        LatLng(
                            getString(R.string.EBC_LAT).toDouble(),
                            getString(R.string.EBC_LNG).toDouble()
                        )
                    )
                    .title(getString(R.string.ebc))
                    .snippet(getString(R.string.ebc_snippet))
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
            )

            mMap.addMarker(
                MarkerOptions()
                    .position(
                        LatLng(
                            getString(R.string.DHAULA_LAT).toDouble(),
                            getString(R.string.DHAULA_LNG).toDouble()
                        )
                    )
                    .title(getString(R.string.dhaula))
                    .snippet(getString(R.string.dhaula_snippet))
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
            )

            mMap.addMarker(
                MarkerOptions()
                    .position(
                        LatLng(
                            getString(R.string.POON_LAT).toDouble(),
                            getString(R.string.POON_LNG).toDouble()
                        )
                    )
                    .title(getString(R.string.poon))
                    .snippet(getString(R.string.poon_snippet))
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
            )

            //NGOs
            mMap.addMarker(
                MarkerOptions()
                    .position(
                        LatLng(
                            getString(R.string.NEPALSONRIE_LAT).toDouble(),
                            getString(R.string.NEPALSONRIE_LNG).toDouble()
                        )
                    )
                    .title(getString(R.string.nepalsonrie))
                    .snippet(getString(R.string.nepalsonrie_snippet))
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
            )
            mMap.addMarker(
                MarkerOptions()
                    .position(
                        LatLng(
                            getString(R.string.UDANA_LAT).toDouble(),
                            getString(R.string.UDANA_LNG).toDouble()
                        )
                    )
                    .title(getString(R.string.udana))
                    .snippet(getString(R.string.udana_snippet))
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
            )
            //BUSINESS
            mMap.addMarker(
                MarkerOptions()
                    .position(
                        LatLng(
                            getString(R.string.NISCHAL_LAT).toDouble(),
                            getString(R.string.NISCHAL_LNG).toDouble()
                        )
                    )
                    .title(getString(R.string.nischal_guesthouse))
                    .snippet(getString(R.string.nischal_guesthouse_snippet))
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
            )
            mMap.addMarker(
                MarkerOptions()
                    .position(
                        LatLng(
                            getString(R.string.NOTTOPVIEW_LAT).toDouble(),
                            getString(R.string.NOTTOPVIEW_LNG).toDouble()
                        )
                    )
                    .title(getString(R.string.nottopview_restaurant))
                    .snippet(getString(R.string.nottopview_restaurant_snippet))
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
            )
            mMap.addMarker(
                MarkerOptions()
                    .position(
                        LatLng(
                            getString(R.string.NAYAPUL_LAT).toDouble(),
                            getString(R.string.NAYAPUL_LNG).toDouble()
                        )
                    )
                    .title(getString(R.string.nayapul_teahouse))
                    .snippet(getString(R.string.nayapul_teahouse_snippet))
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
            )
        }

        return binding.root
    }

    private fun createPolylines() {
        val polylineOptions = PolylineOptions()
            .add(
                LatLng(
                    28.8823635,
                    80.0612584
                )
            )
            .add(
                LatLng(
                    27.6550433,
                    82.7212214
                )
            )
            .add(
                LatLng(
                    26.9971063,
                    84.8568961,
                )
            )
            .add(
                LatLng(
                    26.368344,
                    87.2977277

                )
            )
            .add(
                LatLng(
                    27.2485367,
                    88.0273333
                )
            )

            .add(
                LatLng(
                    27.9125569,
                    85.999186
                )
            )
            .add(
                LatLng(

                    30.0485139,
                    82.3227869
                )
            )
            .add(
                LatLng(
                    30.0651529,
                    81.0986009

                )
            )
            .add(
                LatLng(
                    28.8823635,
                    80.0612584

                )
            )
            .width(4f)
            .color(ContextCompat.getColor(requireContext(), R.color.secondary_dark))

        val polyline = map.addPolyline(polylineOptions)
        polyline.startCap = RoundCap()
        polyline.endCap = RoundCap()
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        createPolylines()
    }

//    private fun bitmapDescriptorFromVector(context: Context?, vectorResId: Int): BitmapDescriptor {
//        val vectorDrawable = ContextCompat.getDrawable(context!!, vectorResId)
//        vectorDrawable!!.setBounds(
//            0,
//            0,
//            vectorDrawable.intrinsicWidth,
//            vectorDrawable.intrinsicHeight
//        )
//        val bitmap =
//            Bitmap.createBitmap(
//                vectorDrawable.intrinsicWidth,
//                vectorDrawable.intrinsicHeight,
//                Bitmap.Config.ARGB_8888
//            )
//        val canvas = Canvas(bitmap)
//        vectorDrawable.draw(canvas)
//        return BitmapDescriptorFactory.fromBitmap(bitmap)
//    }


}