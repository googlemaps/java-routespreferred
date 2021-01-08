// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routes/v1/compute_routes_request.proto

package com.google.maps.routes.v1;

public interface ComputeRoutesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.maps.routes.v1.ComputeRoutesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Origin waypoint.
   * </pre>
   *
   * <code>.google.maps.routes.v1.Waypoint origin = 1;</code>
   * @return Whether the origin field is set.
   */
  boolean hasOrigin();
  /**
   * <pre>
   * Required. Origin waypoint.
   * </pre>
   *
   * <code>.google.maps.routes.v1.Waypoint origin = 1;</code>
   * @return The origin.
   */
  com.google.maps.routes.v1.Waypoint getOrigin();
  /**
   * <pre>
   * Required. Origin waypoint.
   * </pre>
   *
   * <code>.google.maps.routes.v1.Waypoint origin = 1;</code>
   */
  com.google.maps.routes.v1.WaypointOrBuilder getOriginOrBuilder();

  /**
   * <pre>
   * Required. Destination waypoint.
   * </pre>
   *
   * <code>.google.maps.routes.v1.Waypoint destination = 2;</code>
   * @return Whether the destination field is set.
   */
  boolean hasDestination();
  /**
   * <pre>
   * Required. Destination waypoint.
   * </pre>
   *
   * <code>.google.maps.routes.v1.Waypoint destination = 2;</code>
   * @return The destination.
   */
  com.google.maps.routes.v1.Waypoint getDestination();
  /**
   * <pre>
   * Required. Destination waypoint.
   * </pre>
   *
   * <code>.google.maps.routes.v1.Waypoint destination = 2;</code>
   */
  com.google.maps.routes.v1.WaypointOrBuilder getDestinationOrBuilder();

  /**
   * <pre>
   * Optional. A set of waypoints along the route (excluding terminal points),
   * for either stopping at or passing by. Up to 25 intermediate waypoints are
   * supported.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.Waypoint intermediates = 3;</code>
   */
  java.util.List<com.google.maps.routes.v1.Waypoint> 
      getIntermediatesList();
  /**
   * <pre>
   * Optional. A set of waypoints along the route (excluding terminal points),
   * for either stopping at or passing by. Up to 25 intermediate waypoints are
   * supported.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.Waypoint intermediates = 3;</code>
   */
  com.google.maps.routes.v1.Waypoint getIntermediates(int index);
  /**
   * <pre>
   * Optional. A set of waypoints along the route (excluding terminal points),
   * for either stopping at or passing by. Up to 25 intermediate waypoints are
   * supported.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.Waypoint intermediates = 3;</code>
   */
  int getIntermediatesCount();
  /**
   * <pre>
   * Optional. A set of waypoints along the route (excluding terminal points),
   * for either stopping at or passing by. Up to 25 intermediate waypoints are
   * supported.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.Waypoint intermediates = 3;</code>
   */
  java.util.List<? extends com.google.maps.routes.v1.WaypointOrBuilder> 
      getIntermediatesOrBuilderList();
  /**
   * <pre>
   * Optional. A set of waypoints along the route (excluding terminal points),
   * for either stopping at or passing by. Up to 25 intermediate waypoints are
   * supported.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.Waypoint intermediates = 3;</code>
   */
  com.google.maps.routes.v1.WaypointOrBuilder getIntermediatesOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Specifies the mode of transportation.
   * </pre>
   *
   * <code>.google.maps.routes.v1.RouteTravelMode travel_mode = 4;</code>
   * @return The enum numeric value on the wire for travelMode.
   */
  int getTravelModeValue();
  /**
   * <pre>
   * Optional. Specifies the mode of transportation.
   * </pre>
   *
   * <code>.google.maps.routes.v1.RouteTravelMode travel_mode = 4;</code>
   * @return The travelMode.
   */
  com.google.maps.routes.v1.RouteTravelMode getTravelMode();

  /**
   * <pre>
   * Optional. Specifies how to compute the route. The server
   * attempts to use the selected routing preference to compute the route. If
   *  the routing preference results in an error or an extra long latency, then
   * an error is returned. In the future, we might implement a fallback
   * mechanism to use a different option when the preferred option does not give
   * a valid result. You can specify this option only when the `travel_mode` is
   * `DRIVE` or `TWO_WHEELER`, otherwise the request fails.
   * </pre>
   *
   * <code>.google.maps.routes.v1.RoutingPreference routing_preference = 5;</code>
   * @return The enum numeric value on the wire for routingPreference.
   */
  int getRoutingPreferenceValue();
  /**
   * <pre>
   * Optional. Specifies how to compute the route. The server
   * attempts to use the selected routing preference to compute the route. If
   *  the routing preference results in an error or an extra long latency, then
   * an error is returned. In the future, we might implement a fallback
   * mechanism to use a different option when the preferred option does not give
   * a valid result. You can specify this option only when the `travel_mode` is
   * `DRIVE` or `TWO_WHEELER`, otherwise the request fails.
   * </pre>
   *
   * <code>.google.maps.routes.v1.RoutingPreference routing_preference = 5;</code>
   * @return The routingPreference.
   */
  com.google.maps.routes.v1.RoutingPreference getRoutingPreference();

  /**
   * <pre>
   * Optional. Specifies your preference for the quality of the polyline.
   * </pre>
   *
   * <code>.google.maps.routes.v1.PolylineQuality polyline_quality = 6;</code>
   * @return The enum numeric value on the wire for polylineQuality.
   */
  int getPolylineQualityValue();
  /**
   * <pre>
   * Optional. Specifies your preference for the quality of the polyline.
   * </pre>
   *
   * <code>.google.maps.routes.v1.PolylineQuality polyline_quality = 6;</code>
   * @return The polylineQuality.
   */
  com.google.maps.routes.v1.PolylineQuality getPolylineQuality();

  /**
   * <pre>
   * Optional. The departure time. If you don't set this value, then this value
   * defaults to the time that you made the request. If you set this value to a
   * time that has already occurred, then the request fails.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp departure_time = 7;</code>
   * @return Whether the departureTime field is set.
   */
  boolean hasDepartureTime();
  /**
   * <pre>
   * Optional. The departure time. If you don't set this value, then this value
   * defaults to the time that you made the request. If you set this value to a
   * time that has already occurred, then the request fails.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp departure_time = 7;</code>
   * @return The departureTime.
   */
  com.google.protobuf.Timestamp getDepartureTime();
  /**
   * <pre>
   * Optional. The departure time. If you don't set this value, then this value
   * defaults to the time that you made the request. If you set this value to a
   * time that has already occurred, then the request fails.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp departure_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDepartureTimeOrBuilder();

  /**
   * <pre>
   * Specifies whether to calculate alternate routes in addition to the route.
   * </pre>
   *
   * <code>bool compute_alternative_routes = 8;</code>
   * @return The computeAlternativeRoutes.
   */
  boolean getComputeAlternativeRoutes();

  /**
   * <pre>
   * Optional. A set of conditions to satisfy that affect the way routes are
   * calculated.
   * </pre>
   *
   * <code>.google.maps.routes.v1.RouteModifiers route_modifiers = 9;</code>
   * @return Whether the routeModifiers field is set.
   */
  boolean hasRouteModifiers();
  /**
   * <pre>
   * Optional. A set of conditions to satisfy that affect the way routes are
   * calculated.
   * </pre>
   *
   * <code>.google.maps.routes.v1.RouteModifiers route_modifiers = 9;</code>
   * @return The routeModifiers.
   */
  com.google.maps.routes.v1.RouteModifiers getRouteModifiers();
  /**
   * <pre>
   * Optional. A set of conditions to satisfy that affect the way routes are
   * calculated.
   * </pre>
   *
   * <code>.google.maps.routes.v1.RouteModifiers route_modifiers = 9;</code>
   */
  com.google.maps.routes.v1.RouteModifiersOrBuilder getRouteModifiersOrBuilder();

  /**
   * <pre>
   * Optional. The BCP-47 language code, such as "en-US" or "sr-Latn". For more
   * information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. See
   * [Language Support](https://developers.google.com/maps/faq#languagesupport)
   * for the list of supported languages. When you don't provide this value, the
   * display language is inferred from the location of the route request.
   * </pre>
   *
   * <code>string language_code = 10;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Optional. The BCP-47 language code, such as "en-US" or "sr-Latn". For more
   * information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. See
   * [Language Support](https://developers.google.com/maps/faq#languagesupport)
   * for the list of supported languages. When you don't provide this value, the
   * display language is inferred from the location of the route request.
   * </pre>
   *
   * <code>string language_code = 10;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * Optional. Specifies the units of measure for the display fields. This
   * includes the `instruction` field in `NavigationInstruction`. The units of
   * measure used for the route, leg, step distance, and duration are not
   * affected by this value. If you don't provide this value, then the display
   * units are inferred from the location of the request.
   * </pre>
   *
   * <code>.google.maps.routes.v1.Units units = 11;</code>
   * @return The enum numeric value on the wire for units.
   */
  int getUnitsValue();
  /**
   * <pre>
   * Optional. Specifies the units of measure for the display fields. This
   * includes the `instruction` field in `NavigationInstruction`. The units of
   * measure used for the route, leg, step distance, and duration are not
   * affected by this value. If you don't provide this value, then the display
   * units are inferred from the location of the request.
   * </pre>
   *
   * <code>.google.maps.routes.v1.Units units = 11;</code>
   * @return The units.
   */
  com.google.maps.routes.v1.Units getUnits();
}