// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app/dns/config.proto

package com.v2ray.core.app.dns;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.app.dns.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Nameservers used by this DNS. Only traditional UDP servers are support at
   * the moment. A special value 'localhost' as a domain address can be set to
   * use DNS on local system.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.net.Endpoint NameServers = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.v2ray.core.common.net.Endpoint> 
      getNameServersList();
  /**
   * <pre>
   * Nameservers used by this DNS. Only traditional UDP servers are support at
   * the moment. A special value 'localhost' as a domain address can be set to
   * use DNS on local system.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.net.Endpoint NameServers = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.v2ray.core.common.net.Endpoint getNameServers(int index);
  /**
   * <pre>
   * Nameservers used by this DNS. Only traditional UDP servers are support at
   * the moment. A special value 'localhost' as a domain address can be set to
   * use DNS on local system.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.net.Endpoint NameServers = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getNameServersCount();
  /**
   * <pre>
   * Nameservers used by this DNS. Only traditional UDP servers are support at
   * the moment. A special value 'localhost' as a domain address can be set to
   * use DNS on local system.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.net.Endpoint NameServers = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.v2ray.core.common.net.EndpointOrBuilder> 
      getNameServersOrBuilderList();
  /**
   * <pre>
   * Nameservers used by this DNS. Only traditional UDP servers are support at
   * the moment. A special value 'localhost' as a domain address can be set to
   * use DNS on local system.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.net.Endpoint NameServers = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.v2ray.core.common.net.EndpointOrBuilder getNameServersOrBuilder(
      int index);

  /**
   * <pre>
   * NameServer list used by this DNS client.
   * </pre>
   *
   * <code>repeated .v2ray.core.app.dns.NameServer name_server = 5;</code>
   */
  java.util.List<com.v2ray.core.app.dns.NameServer> 
      getNameServerList();
  /**
   * <pre>
   * NameServer list used by this DNS client.
   * </pre>
   *
   * <code>repeated .v2ray.core.app.dns.NameServer name_server = 5;</code>
   */
  com.v2ray.core.app.dns.NameServer getNameServer(int index);
  /**
   * <pre>
   * NameServer list used by this DNS client.
   * </pre>
   *
   * <code>repeated .v2ray.core.app.dns.NameServer name_server = 5;</code>
   */
  int getNameServerCount();
  /**
   * <pre>
   * NameServer list used by this DNS client.
   * </pre>
   *
   * <code>repeated .v2ray.core.app.dns.NameServer name_server = 5;</code>
   */
  java.util.List<? extends com.v2ray.core.app.dns.NameServerOrBuilder> 
      getNameServerOrBuilderList();
  /**
   * <pre>
   * NameServer list used by this DNS client.
   * </pre>
   *
   * <code>repeated .v2ray.core.app.dns.NameServer name_server = 5;</code>
   */
  com.v2ray.core.app.dns.NameServerOrBuilder getNameServerOrBuilder(
      int index);

  /**
   * <pre>
   * Static hosts. Domain to IP.
   * Deprecated. Use static_hosts.
   * </pre>
   *
   * <code>map&lt;string, .v2ray.core.common.net.IPOrDomain&gt; Hosts = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getHostsCount();
  /**
   * <pre>
   * Static hosts. Domain to IP.
   * Deprecated. Use static_hosts.
   * </pre>
   *
   * <code>map&lt;string, .v2ray.core.common.net.IPOrDomain&gt; Hosts = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean containsHosts(
      java.lang.String key);
  /**
   * Use {@link #getHostsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.v2ray.core.common.net.IPOrDomain>
  getHosts();
  /**
   * <pre>
   * Static hosts. Domain to IP.
   * Deprecated. Use static_hosts.
   * </pre>
   *
   * <code>map&lt;string, .v2ray.core.common.net.IPOrDomain&gt; Hosts = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.Map<java.lang.String, com.v2ray.core.common.net.IPOrDomain>
  getHostsMap();
  /**
   * <pre>
   * Static hosts. Domain to IP.
   * Deprecated. Use static_hosts.
   * </pre>
   *
   * <code>map&lt;string, .v2ray.core.common.net.IPOrDomain&gt; Hosts = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated 
  /* nullable */
com.v2ray.core.common.net.IPOrDomain getHostsOrDefault(
      java.lang.String key,
      /* nullable */
com.v2ray.core.common.net.IPOrDomain defaultValue);
  /**
   * <pre>
   * Static hosts. Domain to IP.
   * Deprecated. Use static_hosts.
   * </pre>
   *
   * <code>map&lt;string, .v2ray.core.common.net.IPOrDomain&gt; Hosts = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated 
  com.v2ray.core.common.net.IPOrDomain getHostsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Client IP for EDNS client subnet. Must be 4 bytes (IPv4) or 16 bytes
   * (IPv6).
   * </pre>
   *
   * <code>bytes client_ip = 3;</code>
   * @return The clientIp.
   */
  com.google.protobuf.ByteString getClientIp();

  /**
   * <code>repeated .v2ray.core.app.dns.Config.HostMapping static_hosts = 4;</code>
   */
  java.util.List<com.v2ray.core.app.dns.Config.HostMapping> 
      getStaticHostsList();
  /**
   * <code>repeated .v2ray.core.app.dns.Config.HostMapping static_hosts = 4;</code>
   */
  com.v2ray.core.app.dns.Config.HostMapping getStaticHosts(int index);
  /**
   * <code>repeated .v2ray.core.app.dns.Config.HostMapping static_hosts = 4;</code>
   */
  int getStaticHostsCount();
  /**
   * <code>repeated .v2ray.core.app.dns.Config.HostMapping static_hosts = 4;</code>
   */
  java.util.List<? extends com.v2ray.core.app.dns.Config.HostMappingOrBuilder> 
      getStaticHostsOrBuilderList();
  /**
   * <code>repeated .v2ray.core.app.dns.Config.HostMapping static_hosts = 4;</code>
   */
  com.v2ray.core.app.dns.Config.HostMappingOrBuilder getStaticHostsOrBuilder(
      int index);

  /**
   * <pre>
   * Tag is the inbound tag of DNS client.
   * </pre>
   *
   * <code>string tag = 6;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <pre>
   * Tag is the inbound tag of DNS client.
   * </pre>
   *
   * <code>string tag = 6;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <pre>
   * DisableCache disables DNS cache
   * </pre>
   *
   * <code>bool disableCache = 8;</code>
   * @return The disableCache.
   */
  boolean getDisableCache();

  /**
   * <code>.v2ray.core.app.dns.QueryStrategy query_strategy = 9;</code>
   * @return The enum numeric value on the wire for queryStrategy.
   */
  int getQueryStrategyValue();
  /**
   * <code>.v2ray.core.app.dns.QueryStrategy query_strategy = 9;</code>
   * @return The queryStrategy.
   */
  com.v2ray.core.app.dns.QueryStrategy getQueryStrategy();

  /**
   * <code>bool disableFallback = 10;</code>
   * @return The disableFallback.
   */
  boolean getDisableFallback();

  /**
   * <code>bool disableFallbackIfMatch = 11;</code>
   * @return The disableFallbackIfMatch.
   */
  boolean getDisableFallbackIfMatch();
}
