package ug;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f21794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f21795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f21796c;

    public g0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        jc.l.e(inetSocketAddress, "socketAddress");
        this.f21794a = aVar;
        this.f21795b = proxy;
        this.f21796c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return jc.l.a(g0Var.f21794a, this.f21794a) && jc.l.a(g0Var.f21795b, this.f21795b) && jc.l.a(g0Var.f21796c, this.f21796c);
    }

    public final int hashCode() {
        return this.f21796c.hashCode() + ((this.f21795b.hashCode() + ((this.f21794a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        t tVar = this.f21794a.f21716h;
        String str = tVar.f21872d;
        InetSocketAddress inetSocketAddress = this.f21796c;
        InetAddress address = inetSocketAddress.getAddress();
        String strB = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : wg.d.b(hostAddress);
        if (ef.n.o0(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (tVar.f21873e != inetSocketAddress.getPort() || str.equals(strB)) {
            sb.append(":");
            sb.append(tVar.f21873e);
        }
        if (!str.equals(strB)) {
            if (this.f21795b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strB == null) {
                sb.append("<unresolved>");
            } else if (ef.n.o0(strB, ':')) {
                sb.append("[");
                sb.append(strB);
                sb.append("]");
            } else {
                sb.append(strB);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
