package org.consensusj.namecoin.rpc

import org.consensusj.jsonrpc.groovy.DynamicRpcMethodFallback

/**
 * Namecoin RPC client for scripting
 * No args constructor reads namecoin.conf
 * Allows dynamic methods to access new RPCs or RPCs not implemented in Java client
 */
class NamecoinScriptingClient extends NamecoinClient implements DynamicRpcMethodFallback {
    public NamecoinScriptingClient() {
        super(readConfig());
    }
}
