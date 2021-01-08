// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routes/v1/compute_route_matrix_request.proto

package com.google.maps.routes.v1;

/**
 * <pre>
 * A single destination for ComputeRouteMatrixRequest
 * </pre>
 *
 * Protobuf type {@code google.maps.routes.v1.RouteMatrixDestination}
 */
public final class RouteMatrixDestination extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.maps.routes.v1.RouteMatrixDestination)
    RouteMatrixDestinationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RouteMatrixDestination.newBuilder() to construct.
  private RouteMatrixDestination(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RouteMatrixDestination() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RouteMatrixDestination();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RouteMatrixDestination(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.maps.routes.v1.Waypoint.Builder subBuilder = null;
            if (waypoint_ != null) {
              subBuilder = waypoint_.toBuilder();
            }
            waypoint_ = input.readMessage(com.google.maps.routes.v1.Waypoint.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(waypoint_);
              waypoint_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.maps.routes.v1.ComputeRouteMatrixRequestProto.internal_static_google_maps_routes_v1_RouteMatrixDestination_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.routes.v1.ComputeRouteMatrixRequestProto.internal_static_google_maps_routes_v1_RouteMatrixDestination_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.routes.v1.RouteMatrixDestination.class, com.google.maps.routes.v1.RouteMatrixDestination.Builder.class);
  }

  public static final int WAYPOINT_FIELD_NUMBER = 1;
  private com.google.maps.routes.v1.Waypoint waypoint_;
  /**
   * <pre>
   * Required. Destination waypoint
   * </pre>
   *
   * <code>.google.maps.routes.v1.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the waypoint field is set.
   */
  @java.lang.Override
  public boolean hasWaypoint() {
    return waypoint_ != null;
  }
  /**
   * <pre>
   * Required. Destination waypoint
   * </pre>
   *
   * <code>.google.maps.routes.v1.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The waypoint.
   */
  @java.lang.Override
  public com.google.maps.routes.v1.Waypoint getWaypoint() {
    return waypoint_ == null ? com.google.maps.routes.v1.Waypoint.getDefaultInstance() : waypoint_;
  }
  /**
   * <pre>
   * Required. Destination waypoint
   * </pre>
   *
   * <code>.google.maps.routes.v1.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.maps.routes.v1.WaypointOrBuilder getWaypointOrBuilder() {
    return getWaypoint();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (waypoint_ != null) {
      output.writeMessage(1, getWaypoint());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (waypoint_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWaypoint());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.maps.routes.v1.RouteMatrixDestination)) {
      return super.equals(obj);
    }
    com.google.maps.routes.v1.RouteMatrixDestination other = (com.google.maps.routes.v1.RouteMatrixDestination) obj;

    if (hasWaypoint() != other.hasWaypoint()) return false;
    if (hasWaypoint()) {
      if (!getWaypoint()
          .equals(other.getWaypoint())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasWaypoint()) {
      hash = (37 * hash) + WAYPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getWaypoint().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.routes.v1.RouteMatrixDestination parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.routes.v1.RouteMatrixDestination parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.routes.v1.RouteMatrixDestination parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.routes.v1.RouteMatrixDestination parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.routes.v1.RouteMatrixDestination parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.routes.v1.RouteMatrixDestination parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.routes.v1.RouteMatrixDestination parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.routes.v1.RouteMatrixDestination parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.routes.v1.RouteMatrixDestination parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.maps.routes.v1.RouteMatrixDestination parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.routes.v1.RouteMatrixDestination parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.routes.v1.RouteMatrixDestination parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.maps.routes.v1.RouteMatrixDestination prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A single destination for ComputeRouteMatrixRequest
   * </pre>
   *
   * Protobuf type {@code google.maps.routes.v1.RouteMatrixDestination}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.maps.routes.v1.RouteMatrixDestination)
      com.google.maps.routes.v1.RouteMatrixDestinationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.maps.routes.v1.ComputeRouteMatrixRequestProto.internal_static_google_maps_routes_v1_RouteMatrixDestination_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.routes.v1.ComputeRouteMatrixRequestProto.internal_static_google_maps_routes_v1_RouteMatrixDestination_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.routes.v1.RouteMatrixDestination.class, com.google.maps.routes.v1.RouteMatrixDestination.Builder.class);
    }

    // Construct using com.google.maps.routes.v1.RouteMatrixDestination.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (waypointBuilder_ == null) {
        waypoint_ = null;
      } else {
        waypoint_ = null;
        waypointBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.maps.routes.v1.ComputeRouteMatrixRequestProto.internal_static_google_maps_routes_v1_RouteMatrixDestination_descriptor;
    }

    @java.lang.Override
    public com.google.maps.routes.v1.RouteMatrixDestination getDefaultInstanceForType() {
      return com.google.maps.routes.v1.RouteMatrixDestination.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.routes.v1.RouteMatrixDestination build() {
      com.google.maps.routes.v1.RouteMatrixDestination result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.routes.v1.RouteMatrixDestination buildPartial() {
      com.google.maps.routes.v1.RouteMatrixDestination result = new com.google.maps.routes.v1.RouteMatrixDestination(this);
      if (waypointBuilder_ == null) {
        result.waypoint_ = waypoint_;
      } else {
        result.waypoint_ = waypointBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.maps.routes.v1.RouteMatrixDestination) {
        return mergeFrom((com.google.maps.routes.v1.RouteMatrixDestination)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.routes.v1.RouteMatrixDestination other) {
      if (other == com.google.maps.routes.v1.RouteMatrixDestination.getDefaultInstance()) return this;
      if (other.hasWaypoint()) {
        mergeWaypoint(other.getWaypoint());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.maps.routes.v1.RouteMatrixDestination parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.maps.routes.v1.RouteMatrixDestination) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.maps.routes.v1.Waypoint waypoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.maps.routes.v1.Waypoint, com.google.maps.routes.v1.Waypoint.Builder, com.google.maps.routes.v1.WaypointOrBuilder> waypointBuilder_;
    /**
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>.google.maps.routes.v1.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the waypoint field is set.
     */
    public boolean hasWaypoint() {
      return waypointBuilder_ != null || waypoint_ != null;
    }
    /**
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>.google.maps.routes.v1.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The waypoint.
     */
    public com.google.maps.routes.v1.Waypoint getWaypoint() {
      if (waypointBuilder_ == null) {
        return waypoint_ == null ? com.google.maps.routes.v1.Waypoint.getDefaultInstance() : waypoint_;
      } else {
        return waypointBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>.google.maps.routes.v1.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setWaypoint(com.google.maps.routes.v1.Waypoint value) {
      if (waypointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        waypoint_ = value;
        onChanged();
      } else {
        waypointBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>.google.maps.routes.v1.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setWaypoint(
        com.google.maps.routes.v1.Waypoint.Builder builderForValue) {
      if (waypointBuilder_ == null) {
        waypoint_ = builderForValue.build();
        onChanged();
      } else {
        waypointBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>.google.maps.routes.v1.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeWaypoint(com.google.maps.routes.v1.Waypoint value) {
      if (waypointBuilder_ == null) {
        if (waypoint_ != null) {
          waypoint_ =
            com.google.maps.routes.v1.Waypoint.newBuilder(waypoint_).mergeFrom(value).buildPartial();
        } else {
          waypoint_ = value;
        }
        onChanged();
      } else {
        waypointBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>.google.maps.routes.v1.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearWaypoint() {
      if (waypointBuilder_ == null) {
        waypoint_ = null;
        onChanged();
      } else {
        waypoint_ = null;
        waypointBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>.google.maps.routes.v1.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.maps.routes.v1.Waypoint.Builder getWaypointBuilder() {
      
      onChanged();
      return getWaypointFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>.google.maps.routes.v1.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.maps.routes.v1.WaypointOrBuilder getWaypointOrBuilder() {
      if (waypointBuilder_ != null) {
        return waypointBuilder_.getMessageOrBuilder();
      } else {
        return waypoint_ == null ?
            com.google.maps.routes.v1.Waypoint.getDefaultInstance() : waypoint_;
      }
    }
    /**
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>.google.maps.routes.v1.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.maps.routes.v1.Waypoint, com.google.maps.routes.v1.Waypoint.Builder, com.google.maps.routes.v1.WaypointOrBuilder> 
        getWaypointFieldBuilder() {
      if (waypointBuilder_ == null) {
        waypointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.routes.v1.Waypoint, com.google.maps.routes.v1.Waypoint.Builder, com.google.maps.routes.v1.WaypointOrBuilder>(
                getWaypoint(),
                getParentForChildren(),
                isClean());
        waypoint_ = null;
      }
      return waypointBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.maps.routes.v1.RouteMatrixDestination)
  }

  // @@protoc_insertion_point(class_scope:google.maps.routes.v1.RouteMatrixDestination)
  private static final com.google.maps.routes.v1.RouteMatrixDestination DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.maps.routes.v1.RouteMatrixDestination();
  }

  public static com.google.maps.routes.v1.RouteMatrixDestination getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouteMatrixDestination>
      PARSER = new com.google.protobuf.AbstractParser<RouteMatrixDestination>() {
    @java.lang.Override
    public RouteMatrixDestination parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RouteMatrixDestination(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RouteMatrixDestination> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouteMatrixDestination> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.routes.v1.RouteMatrixDestination getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

