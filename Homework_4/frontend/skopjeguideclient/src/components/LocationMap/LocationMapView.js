import React from 'react';
import { MapContainer, TileLayer, Marker, Popup } from "react-leaflet";
import "../../index.css";

export default function LocationMapView({lat, lon, name}) {
    return (
        <>
          <MapContainer center={[lat, lon]} zoom={12}  >
              <TileLayer
                  attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
                  url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
              />
              <Marker position={[lat, lon]}>
                  <Popup>
                      {name}
                  </Popup>
              </Marker>
          </MapContainer>
            </>
    );
}
