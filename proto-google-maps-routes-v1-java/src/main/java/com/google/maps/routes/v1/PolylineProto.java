// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routes/v1/polyline.proto

package com.google.maps.routes.v1;

public final class PolylineProto {
  private PolylineProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_maps_routes_v1_Polyline_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routes_v1_Polyline_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$google/maps/routes/v1/polyline.proto\022\025" +
      "google.maps.routes.v1\032\034google/protobuf/s" +
      "truct.proto\"o\n\010Polyline\022\032\n\020encoded_polyl" +
      "ine\030\001 \001(\tH\000\0226\n\023geo_json_linestring\030\002 \001(\013" +
      "2\027.google.protobuf.StructH\000B\017\n\rpolyline_" +
      "type*S\n\017PolylineQuality\022 \n\034POLYLINE_QUAL" +
      "ITY_UNSPECIFIED\020\000\022\020\n\014HIGH_QUALITY\020\001\022\014\n\010O" +
      "VERVIEW\020\002B\243\001\n\031com.google.maps.routes.v1B" +
      "\rPolylineProtoP\001Z;google.golang.org/genp" +
      "roto/googleapis/maps/routes/v1;routes\370\001\001" +
      "\242\002\004GMRS\252\002\025Google.Maps.Routes.V1\312\002\025Google" +
      "\\Maps\\Routes\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_maps_routes_v1_Polyline_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_routes_v1_Polyline_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_maps_routes_v1_Polyline_descriptor,
        new java.lang.String[] { "EncodedPolyline", "GeoJsonLinestring", "PolylineType", });
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}