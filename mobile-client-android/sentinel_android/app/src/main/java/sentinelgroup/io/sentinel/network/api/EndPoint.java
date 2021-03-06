package sentinelgroup.io.sentinel.network.api;

public class EndPoint {
    public static final String CREATE_NEW_ACCOUNT = "client/account";
    public static final String GET_ACCOUNT_BALANCE = "client/account/balance";
    public static final String GET_FREE_SENT = "dev/free";
    public static final String GET_UNOCCUPIED_VPN_SERVERS = "client/vpn/list";
    public static final String GET_VPN_SERVER_CREDENTIALS = "client/vpn";
    public static final String GET_VPN_USAGE_FOR_USER = "client/vpn/usage";
    public static final String GET_VPN_CURRENT_USAGE = "client/vpn/current";
    public static final String UPDATE_NODE_INFO = "node/info";
    public static final String MAKE_VPN_USAGE_PAYMENT = "client/vpn/pay";
    public static final String REPORT_PAYMENT = "client/vpn/report";
    public static final String GET_OVPN_CONFIG = "ovpn";
}