// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routes/v1/route.proto

package com.google.maps.routes.v1;

/**
 * <pre>
 * Encapsulates the additional information that the user should be informed
 * about, such as possible traffic zone restriction etc. on a route leg.
 * </pre>
 *
 * Protobuf type {@code google.maps.routes.v1.RouteLegTravelAdvisory}
 */
public final class RouteLegTravelAdvisory extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.maps.routes.v1.RouteLegTravelAdvisory)
    RouteLegTravelAdvisoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RouteLegTravelAdvisory.newBuilder() to construct.
  private RouteLegTravelAdvisory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RouteLegTravelAdvisory() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RouteLegTravelAdvisory();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RouteLegTravelAdvisory(
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
            com.google.maps.routes.v1.TollInfo.Builder subBuilder = null;
            if (tollInfo_ != null) {
              subBuilder = tollInfo_.toBuilder();
            }
            tollInfo_ = input.readMessage(com.google.maps.routes.v1.TollInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tollInfo_);
              tollInfo_ = subBuilder.buildPartial();
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
    return com.google.maps.routes.v1.RouteProto.internal_static_google_maps_routes_v1_RouteLegTravelAdvisory_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.routes.v1.RouteProto.internal_static_google_maps_routes_v1_RouteLegTravelAdvisory_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.routes.v1.RouteLegTravelAdvisory.class, com.google.maps.routes.v1.RouteLegTravelAdvisory.Builder.class);
  }

  public static final int TOLL_INFO_FIELD_NUMBER = 1;
  private com.google.maps.routes.v1.TollInfo tollInfo_;
  /**
   * <pre>
   * Encapsulates information about tolls on the specific RouteLeg.
   * This field is only populated if we expect there are tolls on the RouteLeg.
   * If this field is set but the estimated_price subfield is not populated,
   * we expect that road contains tolls but we do not know an estimated price.
   * If this field does not exist, then there is no toll on the RouteLeg.
   * </pre>
   *
   * <code>.google.maps.routes.v1.TollInfo toll_info = 1;</code>
   * @return Whether the tollInfo field is set.
   */
  @java.lang.Override
  public boolean hasTollInfo() {
    return tollInfo_ != null;
  }
  /**
   * <pre>
   * Encapsulates information about tolls on the specific RouteLeg.
   * This field is only populated if we expect there are tolls on the RouteLeg.
   * If this field is set but the estimated_price subfield is not populated,
   * we expect that road contains tolls but we do not know an estimated price.
   * If this field does not exist, then there is no toll on the RouteLeg.
   * </pre>
   *
   * <code>.google.maps.routes.v1.TollInfo toll_info = 1;</code>
   * @return The tollInfo.
   */
  @java.lang.Override
  public com.google.maps.routes.v1.TollInfo getTollInfo() {
    return tollInfo_ == null ? com.google.maps.routes.v1.TollInfo.getDefaultInstance() : tollInfo_;
  }
  /**
   * <pre>
   * Encapsulates information about tolls on the specific RouteLeg.
   * This field is only populated if we expect there are tolls on the RouteLeg.
   * If this field is set but the estimated_price subfield is not populated,
   * we expect that road contains tolls but we do not know an estimated price.
   * If this field does not exist, then there is no toll on the RouteLeg.
   * </pre>
   *
   * <code>.google.maps.routes.v1.TollInfo toll_info = 1;</code>
   */
  @java.lang.Override
  public com.google.maps.routes.v1.TollInfoOrBuilder getTollInfoOrBuilder() {
    return getTollInfo();
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
    if (tollInfo_ != null) {
      output.writeMessage(1, getTollInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tollInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTollInfo());
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
    if (!(obj instanceof com.google.maps.routes.v1.RouteLegTravelAdvisory)) {
      return super.equals(obj);
    }
    com.google.maps.routes.v1.RouteLegTravelAdvisory other = (com.google.maps.routes.v1.RouteLegTravelAdvisory) obj;

    if (hasTollInfo() != other.hasTollInfo()) return false;
    if (hasTollInfo()) {
      if (!getTollInfo()
          .equals(other.getTollInfo())) return false;
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
    if (hasTollInfo()) {
      hash = (37 * hash) + TOLL_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getTollInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.routes.v1.RouteLegTravelAdvisory parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.routes.v1.RouteLegTravelAdvisory parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.routes.v1.RouteLegTravelAdvisory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.routes.v1.RouteLegTravelAdvisory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.routes.v1.RouteLegTravelAdvisory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.routes.v1.RouteLegTravelAdvisory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.routes.v1.RouteLegTravelAdvisory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.routes.v1.RouteLegTravelAdvisory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.routes.v1.RouteLegTravelAdvisory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.maps.routes.v1.RouteLegTravelAdvisory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.routes.v1.RouteLegTravelAdvisory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.routes.v1.RouteLegTravelAdvisory parseFrom(
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
  public static Builder newBuilder(com.google.maps.routes.v1.RouteLegTravelAdvisory prototype) {
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
   * Encapsulates the additional information that the user should be informed
   * about, such as possible traffic zone restriction etc. on a route leg.
   * </pre>
   *
   * Protobuf type {@code google.maps.routes.v1.RouteLegTravelAdvisory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.maps.routes.v1.RouteLegTravelAdvisory)
      com.google.maps.routes.v1.RouteLegTravelAdvisoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.maps.routes.v1.RouteProto.internal_static_google_maps_routes_v1_RouteLegTravelAdvisory_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.routes.v1.RouteProto.internal_static_google_maps_routes_v1_RouteLegTravelAdvisory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.routes.v1.RouteLegTravelAdvisory.class, com.google.maps.routes.v1.RouteLegTravelAdvisory.Builder.class);
    }

    // Construct using com.google.maps.routes.v1.RouteLegTravelAdvisory.newBuilder()
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
      if (tollInfoBuilder_ == null) {
        tollInfo_ = null;
      } else {
        tollInfo_ = null;
        tollInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.maps.routes.v1.RouteProto.internal_static_google_maps_routes_v1_RouteLegTravelAdvisory_descriptor;
    }

    @java.lang.Override
    public com.google.maps.routes.v1.RouteLegTravelAdvisory getDefaultInstanceForType() {
      return com.google.maps.routes.v1.RouteLegTravelAdvisory.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.routes.v1.RouteLegTravelAdvisory build() {
      com.google.maps.routes.v1.RouteLegTravelAdvisory result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.routes.v1.RouteLegTravelAdvisory buildPartial() {
      com.google.maps.routes.v1.RouteLegTravelAdvisory result = new com.google.maps.routes.v1.RouteLegTravelAdvisory(this);
      if (tollInfoBuilder_ == null) {
        result.tollInfo_ = tollInfo_;
      } else {
        result.tollInfo_ = tollInfoBuilder_.build();
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
      if (other instanceof com.google.maps.routes.v1.RouteLegTravelAdvisory) {
        return mergeFrom((com.google.maps.routes.v1.RouteLegTravelAdvisory)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.routes.v1.RouteLegTravelAdvisory other) {
      if (other == com.google.maps.routes.v1.RouteLegTravelAdvisory.getDefaultInstance()) return this;
      if (other.hasTollInfo()) {
        mergeTollInfo(other.getTollInfo());
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
      com.google.maps.routes.v1.RouteLegTravelAdvisory parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.maps.routes.v1.RouteLegTravelAdvisory) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.maps.routes.v1.TollInfo tollInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.maps.routes.v1.TollInfo, com.google.maps.routes.v1.TollInfo.Builder, com.google.maps.routes.v1.TollInfoOrBuilder> tollInfoBuilder_;
    /**
     * <pre>
     * Encapsulates information about tolls on the specific RouteLeg.
     * This field is only populated if we expect there are tolls on the RouteLeg.
     * If this field is set but the estimated_price subfield is not populated,
     * we expect that road contains tolls but we do not know an estimated price.
     * If this field does not exist, then there is no toll on the RouteLeg.
     * </pre>
     *
     * <code>.google.maps.routes.v1.TollInfo toll_info = 1;</code>
     * @return Whether the tollInfo field is set.
     */
    public boolean hasTollInfo() {
      return tollInfoBuilder_ != null || tollInfo_ != null;
    }
    /**
     * <pre>
     * Encapsulates information about tolls on the specific RouteLeg.
     * This field is only populated if we expect there are tolls on the RouteLeg.
     * If this field is set but the estimated_price subfield is not populated,
     * we expect that road contains tolls but we do not know an estimated price.
     * If this field does not exist, then there is no toll on the RouteLeg.
     * </pre>
     *
     * <code>.google.maps.routes.v1.TollInfo toll_info = 1;</code>
     * @return The tollInfo.
     */
    public com.google.maps.routes.v1.TollInfo getTollInfo() {
      if (tollInfoBuilder_ == null) {
        return tollInfo_ == null ? com.google.maps.routes.v1.TollInfo.getDefaultInstance() : tollInfo_;
      } else {
        return tollInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Encapsulates information about tolls on the specific RouteLeg.
     * This field is only populated if we expect there are tolls on the RouteLeg.
     * If this field is set but the estimated_price subfield is not populated,
     * we expect that road contains tolls but we do not know an estimated price.
     * If this field does not exist, then there is no toll on the RouteLeg.
     * </pre>
     *
     * <code>.google.maps.routes.v1.TollInfo toll_info = 1;</code>
     */
    public Builder setTollInfo(com.google.maps.routes.v1.TollInfo value) {
      if (tollInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tollInfo_ = value;
        onChanged();
      } else {
        tollInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Encapsulates information about tolls on the specific RouteLeg.
     * This field is only populated if we expect there are tolls on the RouteLeg.
     * If this field is set but the estimated_price subfield is not populated,
     * we expect that road contains tolls but we do not know an estimated price.
     * If this field does not exist, then there is no toll on the RouteLeg.
     * </pre>
     *
     * <code>.google.maps.routes.v1.TollInfo toll_info = 1;</code>
     */
    public Builder setTollInfo(
        com.google.maps.routes.v1.TollInfo.Builder builderForValue) {
      if (tollInfoBuilder_ == null) {
        tollInfo_ = builderForValue.build();
        onChanged();
      } else {
        tollInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Encapsulates information about tolls on the specific RouteLeg.
     * This field is only populated if we expect there are tolls on the RouteLeg.
     * If this field is set but the estimated_price subfield is not populated,
     * we expect that road contains tolls but we do not know an estimated price.
     * If this field does not exist, then there is no toll on the RouteLeg.
     * </pre>
     *
     * <code>.google.maps.routes.v1.TollInfo toll_info = 1;</code>
     */
    public Builder mergeTollInfo(com.google.maps.routes.v1.TollInfo value) {
      if (tollInfoBuilder_ == null) {
        if (tollInfo_ != null) {
          tollInfo_ =
            com.google.maps.routes.v1.TollInfo.newBuilder(tollInfo_).mergeFrom(value).buildPartial();
        } else {
          tollInfo_ = value;
        }
        onChanged();
      } else {
        tollInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Encapsulates information about tolls on the specific RouteLeg.
     * This field is only populated if we expect there are tolls on the RouteLeg.
     * If this field is set but the estimated_price subfield is not populated,
     * we expect that road contains tolls but we do not know an estimated price.
     * If this field does not exist, then there is no toll on the RouteLeg.
     * </pre>
     *
     * <code>.google.maps.routes.v1.TollInfo toll_info = 1;</code>
     */
    public Builder clearTollInfo() {
      if (tollInfoBuilder_ == null) {
        tollInfo_ = null;
        onChanged();
      } else {
        tollInfo_ = null;
        tollInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Encapsulates information about tolls on the specific RouteLeg.
     * This field is only populated if we expect there are tolls on the RouteLeg.
     * If this field is set but the estimated_price subfield is not populated,
     * we expect that road contains tolls but we do not know an estimated price.
     * If this field does not exist, then there is no toll on the RouteLeg.
     * </pre>
     *
     * <code>.google.maps.routes.v1.TollInfo toll_info = 1;</code>
     */
    public com.google.maps.routes.v1.TollInfo.Builder getTollInfoBuilder() {
      
      onChanged();
      return getTollInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Encapsulates information about tolls on the specific RouteLeg.
     * This field is only populated if we expect there are tolls on the RouteLeg.
     * If this field is set but the estimated_price subfield is not populated,
     * we expect that road contains tolls but we do not know an estimated price.
     * If this field does not exist, then there is no toll on the RouteLeg.
     * </pre>
     *
     * <code>.google.maps.routes.v1.TollInfo toll_info = 1;</code>
     */
    public com.google.maps.routes.v1.TollInfoOrBuilder getTollInfoOrBuilder() {
      if (tollInfoBuilder_ != null) {
        return tollInfoBuilder_.getMessageOrBuilder();
      } else {
        return tollInfo_ == null ?
            com.google.maps.routes.v1.TollInfo.getDefaultInstance() : tollInfo_;
      }
    }
    /**
     * <pre>
     * Encapsulates information about tolls on the specific RouteLeg.
     * This field is only populated if we expect there are tolls on the RouteLeg.
     * If this field is set but the estimated_price subfield is not populated,
     * we expect that road contains tolls but we do not know an estimated price.
     * If this field does not exist, then there is no toll on the RouteLeg.
     * </pre>
     *
     * <code>.google.maps.routes.v1.TollInfo toll_info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.maps.routes.v1.TollInfo, com.google.maps.routes.v1.TollInfo.Builder, com.google.maps.routes.v1.TollInfoOrBuilder> 
        getTollInfoFieldBuilder() {
      if (tollInfoBuilder_ == null) {
        tollInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.routes.v1.TollInfo, com.google.maps.routes.v1.TollInfo.Builder, com.google.maps.routes.v1.TollInfoOrBuilder>(
                getTollInfo(),
                getParentForChildren(),
                isClean());
        tollInfo_ = null;
      }
      return tollInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.maps.routes.v1.RouteLegTravelAdvisory)
  }

  // @@protoc_insertion_point(class_scope:google.maps.routes.v1.RouteLegTravelAdvisory)
  private static final com.google.maps.routes.v1.RouteLegTravelAdvisory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.maps.routes.v1.RouteLegTravelAdvisory();
  }

  public static com.google.maps.routes.v1.RouteLegTravelAdvisory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouteLegTravelAdvisory>
      PARSER = new com.google.protobuf.AbstractParser<RouteLegTravelAdvisory>() {
    @java.lang.Override
    public RouteLegTravelAdvisory parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RouteLegTravelAdvisory(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RouteLegTravelAdvisory> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouteLegTravelAdvisory> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.routes.v1.RouteLegTravelAdvisory getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
