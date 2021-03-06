// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routes/v1/compute_routes_request.proto

package com.google.maps.routes.v1;

/**
 * <pre>
 * A set of values that specify the unit of measure used in the display.
 * </pre>
 *
 * Protobuf enum {@code google.maps.routes.v1.Units}
 */
public enum Units
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Units of measure not specified. Defaults to the unit of measure inferred
   * from the request.
   * </pre>
   *
   * <code>UNITS_UNSPECIFIED = 0;</code>
   */
  UNITS_UNSPECIFIED(0),
  /**
   * <pre>
   * Metric units of measure.
   * </pre>
   *
   * <code>METRIC = 1;</code>
   */
  METRIC(1),
  /**
   * <pre>
   * Imperial (English) units of measure.
   * </pre>
   *
   * <code>IMPERIAL = 2;</code>
   */
  IMPERIAL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Units of measure not specified. Defaults to the unit of measure inferred
   * from the request.
   * </pre>
   *
   * <code>UNITS_UNSPECIFIED = 0;</code>
   */
  public static final int UNITS_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Metric units of measure.
   * </pre>
   *
   * <code>METRIC = 1;</code>
   */
  public static final int METRIC_VALUE = 1;
  /**
   * <pre>
   * Imperial (English) units of measure.
   * </pre>
   *
   * <code>IMPERIAL = 2;</code>
   */
  public static final int IMPERIAL_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Units valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Units forNumber(int value) {
    switch (value) {
      case 0: return UNITS_UNSPECIFIED;
      case 1: return METRIC;
      case 2: return IMPERIAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Units>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Units> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Units>() {
          public Units findValueByNumber(int number) {
            return Units.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.maps.routes.v1.ComputeRoutesRequestProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final Units[] VALUES = values();

  public static Units valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Units(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.routes.v1.Units)
}

