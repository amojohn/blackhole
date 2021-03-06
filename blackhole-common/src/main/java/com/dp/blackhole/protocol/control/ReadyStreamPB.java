// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReadyStream.proto

package com.dp.blackhole.protocol.control;

public final class ReadyStreamPB {
  private ReadyStreamPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ReadyStreamOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string topic = 1;
    /**
     * <code>required string topic = 1;</code>
     */
    boolean hasTopic();
    /**
     * <code>required string topic = 1;</code>
     */
    java.lang.String getTopic();
    /**
     * <code>required string topic = 1;</code>
     */
    com.google.protobuf.ByteString
        getTopicBytes();

    // optional string partitionId = 2;
    /**
     * <code>optional string partitionId = 2;</code>
     */
    boolean hasPartitionId();
    /**
     * <code>optional string partitionId = 2;</code>
     */
    java.lang.String getPartitionId();
    /**
     * <code>optional string partitionId = 2;</code>
     */
    com.google.protobuf.ByteString
        getPartitionIdBytes();

    // optional string broker_server = 3;
    /**
     * <code>optional string broker_server = 3;</code>
     */
    boolean hasBrokerServer();
    /**
     * <code>optional string broker_server = 3;</code>
     */
    java.lang.String getBrokerServer();
    /**
     * <code>optional string broker_server = 3;</code>
     */
    com.google.protobuf.ByteString
        getBrokerServerBytes();

    // optional int64 period = 4;
    /**
     * <code>optional int64 period = 4;</code>
     */
    boolean hasPeriod();
    /**
     * <code>optional int64 period = 4;</code>
     */
    long getPeriod();

    // optional int64 connectedTs = 5;
    /**
     * <code>optional int64 connectedTs = 5;</code>
     */
    boolean hasConnectedTs();
    /**
     * <code>optional int64 connectedTs = 5;</code>
     */
    long getConnectedTs();
  }
  /**
   * Protobuf type {@code blackhole.ReadyStream}
   */
  public static final class ReadyStream extends
      com.google.protobuf.GeneratedMessage
      implements ReadyStreamOrBuilder {
    // Use ReadyStream.newBuilder() to construct.
    private ReadyStream(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ReadyStream(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ReadyStream defaultInstance;
    public static ReadyStream getDefaultInstance() {
      return defaultInstance;
    }

    public ReadyStream getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ReadyStream(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              topic_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              partitionId_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              brokerServer_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              period_ = input.readInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              connectedTs_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dp.blackhole.protocol.control.ReadyStreamPB.internal_static_blackhole_ReadyStream_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dp.blackhole.protocol.control.ReadyStreamPB.internal_static_blackhole_ReadyStream_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream.class, com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream.Builder.class);
    }

    public static com.google.protobuf.Parser<ReadyStream> PARSER =
        new com.google.protobuf.AbstractParser<ReadyStream>() {
      public ReadyStream parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReadyStream(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ReadyStream> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string topic = 1;
    public static final int TOPIC_FIELD_NUMBER = 1;
    private java.lang.Object topic_;
    /**
     * <code>required string topic = 1;</code>
     */
    public boolean hasTopic() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string topic = 1;</code>
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          topic_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string topic = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string partitionId = 2;
    public static final int PARTITIONID_FIELD_NUMBER = 2;
    private java.lang.Object partitionId_;
    /**
     * <code>optional string partitionId = 2;</code>
     */
    public boolean hasPartitionId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string partitionId = 2;</code>
     */
    public java.lang.String getPartitionId() {
      java.lang.Object ref = partitionId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          partitionId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string partitionId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPartitionIdBytes() {
      java.lang.Object ref = partitionId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        partitionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string broker_server = 3;
    public static final int BROKER_SERVER_FIELD_NUMBER = 3;
    private java.lang.Object brokerServer_;
    /**
     * <code>optional string broker_server = 3;</code>
     */
    public boolean hasBrokerServer() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string broker_server = 3;</code>
     */
    public java.lang.String getBrokerServer() {
      java.lang.Object ref = brokerServer_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          brokerServer_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string broker_server = 3;</code>
     */
    public com.google.protobuf.ByteString
        getBrokerServerBytes() {
      java.lang.Object ref = brokerServer_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        brokerServer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional int64 period = 4;
    public static final int PERIOD_FIELD_NUMBER = 4;
    private long period_;
    /**
     * <code>optional int64 period = 4;</code>
     */
    public boolean hasPeriod() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int64 period = 4;</code>
     */
    public long getPeriod() {
      return period_;
    }

    // optional int64 connectedTs = 5;
    public static final int CONNECTEDTS_FIELD_NUMBER = 5;
    private long connectedTs_;
    /**
     * <code>optional int64 connectedTs = 5;</code>
     */
    public boolean hasConnectedTs() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int64 connectedTs = 5;</code>
     */
    public long getConnectedTs() {
      return connectedTs_;
    }

    private void initFields() {
      topic_ = "";
      partitionId_ = "";
      brokerServer_ = "";
      period_ = 0L;
      connectedTs_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasTopic()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTopicBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getPartitionIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getBrokerServerBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, period_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, connectedTs_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getTopicBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getPartitionIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getBrokerServerBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, period_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, connectedTs_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code blackhole.ReadyStream}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStreamOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dp.blackhole.protocol.control.ReadyStreamPB.internal_static_blackhole_ReadyStream_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dp.blackhole.protocol.control.ReadyStreamPB.internal_static_blackhole_ReadyStream_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream.class, com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream.Builder.class);
      }

      // Construct using com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        topic_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        partitionId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        brokerServer_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        period_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        connectedTs_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dp.blackhole.protocol.control.ReadyStreamPB.internal_static_blackhole_ReadyStream_descriptor;
      }

      public com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream getDefaultInstanceForType() {
        return com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream.getDefaultInstance();
      }

      public com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream build() {
        com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream buildPartial() {
        com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream result = new com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.topic_ = topic_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.partitionId_ = partitionId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.brokerServer_ = brokerServer_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.period_ = period_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.connectedTs_ = connectedTs_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream) {
          return mergeFrom((com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream other) {
        if (other == com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream.getDefaultInstance()) return this;
        if (other.hasTopic()) {
          bitField0_ |= 0x00000001;
          topic_ = other.topic_;
          onChanged();
        }
        if (other.hasPartitionId()) {
          bitField0_ |= 0x00000002;
          partitionId_ = other.partitionId_;
          onChanged();
        }
        if (other.hasBrokerServer()) {
          bitField0_ |= 0x00000004;
          brokerServer_ = other.brokerServer_;
          onChanged();
        }
        if (other.hasPeriod()) {
          setPeriod(other.getPeriod());
        }
        if (other.hasConnectedTs()) {
          setConnectedTs(other.getConnectedTs());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTopic()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dp.blackhole.protocol.control.ReadyStreamPB.ReadyStream) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string topic = 1;
      private java.lang.Object topic_ = "";
      /**
       * <code>required string topic = 1;</code>
       */
      public boolean hasTopic() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string topic = 1;</code>
       */
      public java.lang.String getTopic() {
        java.lang.Object ref = topic_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          topic_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string topic = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTopicBytes() {
        java.lang.Object ref = topic_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          topic_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string topic = 1;</code>
       */
      public Builder setTopic(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        topic_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string topic = 1;</code>
       */
      public Builder clearTopic() {
        bitField0_ = (bitField0_ & ~0x00000001);
        topic_ = getDefaultInstance().getTopic();
        onChanged();
        return this;
      }
      /**
       * <code>required string topic = 1;</code>
       */
      public Builder setTopicBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        topic_ = value;
        onChanged();
        return this;
      }

      // optional string partitionId = 2;
      private java.lang.Object partitionId_ = "";
      /**
       * <code>optional string partitionId = 2;</code>
       */
      public boolean hasPartitionId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string partitionId = 2;</code>
       */
      public java.lang.String getPartitionId() {
        java.lang.Object ref = partitionId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          partitionId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string partitionId = 2;</code>
       */
      public com.google.protobuf.ByteString
          getPartitionIdBytes() {
        java.lang.Object ref = partitionId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          partitionId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string partitionId = 2;</code>
       */
      public Builder setPartitionId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        partitionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string partitionId = 2;</code>
       */
      public Builder clearPartitionId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        partitionId_ = getDefaultInstance().getPartitionId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string partitionId = 2;</code>
       */
      public Builder setPartitionIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        partitionId_ = value;
        onChanged();
        return this;
      }

      // optional string broker_server = 3;
      private java.lang.Object brokerServer_ = "";
      /**
       * <code>optional string broker_server = 3;</code>
       */
      public boolean hasBrokerServer() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string broker_server = 3;</code>
       */
      public java.lang.String getBrokerServer() {
        java.lang.Object ref = brokerServer_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          brokerServer_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string broker_server = 3;</code>
       */
      public com.google.protobuf.ByteString
          getBrokerServerBytes() {
        java.lang.Object ref = brokerServer_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          brokerServer_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string broker_server = 3;</code>
       */
      public Builder setBrokerServer(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        brokerServer_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string broker_server = 3;</code>
       */
      public Builder clearBrokerServer() {
        bitField0_ = (bitField0_ & ~0x00000004);
        brokerServer_ = getDefaultInstance().getBrokerServer();
        onChanged();
        return this;
      }
      /**
       * <code>optional string broker_server = 3;</code>
       */
      public Builder setBrokerServerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        brokerServer_ = value;
        onChanged();
        return this;
      }

      // optional int64 period = 4;
      private long period_ ;
      /**
       * <code>optional int64 period = 4;</code>
       */
      public boolean hasPeriod() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int64 period = 4;</code>
       */
      public long getPeriod() {
        return period_;
      }
      /**
       * <code>optional int64 period = 4;</code>
       */
      public Builder setPeriod(long value) {
        bitField0_ |= 0x00000008;
        period_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 period = 4;</code>
       */
      public Builder clearPeriod() {
        bitField0_ = (bitField0_ & ~0x00000008);
        period_ = 0L;
        onChanged();
        return this;
      }

      // optional int64 connectedTs = 5;
      private long connectedTs_ ;
      /**
       * <code>optional int64 connectedTs = 5;</code>
       */
      public boolean hasConnectedTs() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int64 connectedTs = 5;</code>
       */
      public long getConnectedTs() {
        return connectedTs_;
      }
      /**
       * <code>optional int64 connectedTs = 5;</code>
       */
      public Builder setConnectedTs(long value) {
        bitField0_ |= 0x00000010;
        connectedTs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 connectedTs = 5;</code>
       */
      public Builder clearConnectedTs() {
        bitField0_ = (bitField0_ & ~0x00000010);
        connectedTs_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:blackhole.ReadyStream)
    }

    static {
      defaultInstance = new ReadyStream(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:blackhole.ReadyStream)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_blackhole_ReadyStream_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blackhole_ReadyStream_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ReadyStream.proto\022\tblackhole\"m\n\013ReadyS" +
      "tream\022\r\n\005topic\030\001 \002(\t\022\023\n\013partitionId\030\002 \001(" +
      "\t\022\025\n\rbroker_server\030\003 \001(\t\022\016\n\006period\030\004 \001(\003" +
      "\022\023\n\013connectedTs\030\005 \001(\003B2\n!com.dp.blackhol" +
      "e.protocol.controlB\rReadyStreamPB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_blackhole_ReadyStream_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_blackhole_ReadyStream_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_blackhole_ReadyStream_descriptor,
              new java.lang.String[] { "Topic", "PartitionId", "BrokerServer", "Period", "ConnectedTs", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
