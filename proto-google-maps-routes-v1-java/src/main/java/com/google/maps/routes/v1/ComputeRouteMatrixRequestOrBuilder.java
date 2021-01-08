// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routes/v1/compute_route_matrix_request.proto

package com.google.maps.routes.v1;

public interface ComputeRouteMatrixRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.maps.routes.v1.ComputeRouteMatrixRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Array of origins, which determines the rows of the response matrix.
   * Several size restrictions apply to the cardinality of origins and
   * destinations:
   * * The number of elements (origins × destinations) must be no greater than
   * 625 in any case.
   * * The number of elements (origins × destinations) must be no greater than
   * 100 if routing_preference is set to `TRAFFIC_AWARE_OPTIMAL`.
   * * The number of waypoints (origins + destinations) specified as `place_id`
   * must be no greater than 50.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.RouteMatrixOrigin origins = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.maps.routes.v1.RouteMatrixOrigin> 
      getOriginsList();
  /**
   * <pre>
   * Required. Array of origins, which determines the rows of the response matrix.
   * Several size restrictions apply to the cardinality of origins and
   * destinations:
   * * The number of elements (origins × destinations) must be no greater than
   * 625 in any case.
   * * The number of elements (origins × destinations) must be no greater than
   * 100 if routing_preference is set to `TRAFFIC_AWARE_OPTIMAL`.
   * * The number of waypoints (origins + destinations) specified as `place_id`
   * must be no greater than 50.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.RouteMatrixOrigin origins = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.maps.routes.v1.RouteMatrixOrigin getOrigins(int index);
  /**
   * <pre>
   * Required. Array of origins, which determines the rows of the response matrix.
   * Several size restrictions apply to the cardinality of origins and
   * destinations:
   * * The number of elements (origins × destinations) must be no greater than
   * 625 in any case.
   * * The number of elements (origins × destinations) must be no greater than
   * 100 if routing_preference is set to `TRAFFIC_AWARE_OPTIMAL`.
   * * The number of waypoints (origins + destinations) specified as `place_id`
   * must be no greater than 50.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.RouteMatrixOrigin origins = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getOriginsCount();
  /**
   * <pre>
   * Required. Array of origins, which determines the rows of the response matrix.
   * Several size restrictions apply to the cardinality of origins and
   * destinations:
   * * The number of elements (origins × destinations) must be no greater than
   * 625 in any case.
   * * The number of elements (origins × destinations) must be no greater than
   * 100 if routing_preference is set to `TRAFFIC_AWARE_OPTIMAL`.
   * * The number of waypoints (origins + destinations) specified as `place_id`
   * must be no greater than 50.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.RouteMatrixOrigin origins = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.maps.routes.v1.RouteMatrixOriginOrBuilder> 
      getOriginsOrBuilderList();
  /**
   * <pre>
   * Required. Array of origins, which determines the rows of the response matrix.
   * Several size restrictions apply to the cardinality of origins and
   * destinations:
   * * The number of elements (origins × destinations) must be no greater than
   * 625 in any case.
   * * The number of elements (origins × destinations) must be no greater than
   * 100 if routing_preference is set to `TRAFFIC_AWARE_OPTIMAL`.
   * * The number of waypoints (origins + destinations) specified as `place_id`
   * must be no greater than 50.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.RouteMatrixOrigin origins = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.maps.routes.v1.RouteMatrixOriginOrBuilder getOriginsOrBuilder(
      int index);

  /**
   * <pre>
   * Required. Array of destinations, which determines the columns of the response matrix.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.RouteMatrixDestination destinations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.maps.routes.v1.RouteMatrixDestination> 
      getDestinationsList();
  /**
   * <pre>
   * Required. Array of destinations, which determines the columns of the response matrix.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.RouteMatrixDestination destinations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.maps.routes.v1.RouteMatrixDestination getDestinations(int index);
  /**
   * <pre>
   * Required. Array of destinations, which determines the columns of the response matrix.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.RouteMatrixDestination destinations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getDestinationsCount();
  /**
   * <pre>
   * Required. Array of destinations, which determines the columns of the response matrix.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.RouteMatrixDestination destinations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.maps.routes.v1.RouteMatrixDestinationOrBuilder> 
      getDestinationsOrBuilderList();
  /**
   * <pre>
   * Required. Array of destinations, which determines the columns of the response matrix.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.RouteMatrixDestination destinations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.maps.routes.v1.RouteMatrixDestinationOrBuilder getDestinationsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Specifies the mode of transportation.
   * </pre>
   *
   * <code>.google.maps.routes.v1.RouteTravelMode travel_mode = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for travelMode.
   */
  int getTravelModeValue();
  /**
   * <pre>
   * Optional. Specifies the mode of transportation.
   * </pre>
   *
   * <code>.google.maps.routes.v1.RouteTravelMode travel_mode = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The travelMode.
   */
  com.google.maps.routes.v1.RouteTravelMode getTravelMode();

  /**
   * <pre>
   * Optional. Specifies how to compute the route. The server attempts to use the selected
   * routing preference to compute the route. If the routing preference results
   * in an error or an extra long latency, an error is returned. In the future,
   * we might implement a fallback mechanism to use a different option when the
   * preferred option does not give a valid result. You can specify this option
   * only when the `travel_mode` is `DRIVE` or `TWO_WHEELER`, otherwise the
   * request fails.
   * </pre>
   *
   * <code>.google.maps.routes.v1.RoutingPreference routing_preference = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for routingPreference.
   */
  int getRoutingPreferenceValue();
  /**
   * <pre>
   * Optional. Specifies how to compute the route. The server attempts to use the selected
   * routing preference to compute the route. If the routing preference results
   * in an error or an extra long latency, an error is returned. In the future,
   * we might implement a fallback mechanism to use a different option when the
   * preferred option does not give a valid result. You can specify this option
   * only when the `travel_mode` is `DRIVE` or `TWO_WHEELER`, otherwise the
   * request fails.
   * </pre>
   *
   * <code>.google.maps.routes.v1.RoutingPreference routing_preference = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The routingPreference.
   */
  com.google.maps.routes.v1.RoutingPreference getRoutingPreference();

  /**
   * <pre>
   * Optional. The departure time. If you don't set this value, this defaults to the time
   * that you made the request. If you set this value to a time that has already
   * occurred, the request fails.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp departure_time = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the departureTime field is set.
   */
  boolean hasDepartureTime();
  /**
   * <pre>
   * Optional. The departure time. If you don't set this value, this defaults to the time
   * that you made the request. If you set this value to a time that has already
   * occurred, the request fails.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp departure_time = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The departureTime.
   */
  com.google.protobuf.Timestamp getDepartureTime();
  /**
   * <pre>
   * Optional. The departure time. If you don't set this value, this defaults to the time
   * that you made the request. If you set this value to a time that has already
   * occurred, the request fails.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp departure_time = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDepartureTimeOrBuilder();
}
