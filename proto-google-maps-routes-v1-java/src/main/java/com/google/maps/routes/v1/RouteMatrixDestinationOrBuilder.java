// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routes/v1/compute_route_matrix_request.proto

package com.google.maps.routes.v1;

public interface RouteMatrixDestinationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.maps.routes.v1.RouteMatrixDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Destination waypoint
   * </pre>
   *
   * <code>.google.maps.routes.v1.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the waypoint field is set.
   */
  boolean hasWaypoint();
  /**
   * <pre>
   * Required. Destination waypoint
   * </pre>
   *
   * <code>.google.maps.routes.v1.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The waypoint.
   */
  com.google.maps.routes.v1.Waypoint getWaypoint();
  /**
   * <pre>
   * Required. Destination waypoint
   * </pre>
   *
   * <code>.google.maps.routes.v1.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.maps.routes.v1.WaypointOrBuilder getWaypointOrBuilder();
}