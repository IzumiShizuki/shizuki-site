package zg;

import b7.b1;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import ug.g0;
import ug.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yg.c f26902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.b f26903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f26909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ug.a f26910i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xa.h f26911j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n f26912k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f26913l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b7.m f26914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c7.p f26915n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g0 f26916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vb.j f26917p;

    public p(yg.c cVar, h9.b bVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, ug.a aVar, xa.h hVar, n nVar, b1 b1Var) {
        jc.l.e(cVar, "taskRunner");
        jc.l.e(bVar, "connectionPool");
        jc.l.e(hVar, "routeDatabase");
        this.f26902a = cVar;
        this.f26903b = bVar;
        this.f26904c = i10;
        this.f26905d = i11;
        this.f26906e = i12;
        this.f26907f = i13;
        this.f26908g = z10;
        this.f26909h = z11;
        this.f26910i = aVar;
        this.f26911j = hVar;
        this.f26912k = nVar;
        this.f26913l = !jc.l.a((String) b1Var.f1651c, "GET");
        this.f26917p = new vb.j();
    }

    public final boolean a(o oVar) {
        c7.p pVar;
        g0 g0Var;
        if (this.f26917p.isEmpty() && this.f26916o == null) {
            if (oVar != null) {
                synchronized (oVar) {
                    g0Var = null;
                    if (oVar.f26896l == 0 && oVar.f26894j && wg.g.a(oVar.f26887c.f21794a.f21716h, this.f26910i.f21716h)) {
                        g0Var = oVar.f26887c;
                    }
                }
                if (g0Var != null) {
                    this.f26916o = g0Var;
                    return true;
                }
            }
            b7.m mVar = this.f26914m;
            if ((mVar == null || mVar.f1958b >= ((ArrayList) mVar.f1959c).size()) && (pVar = this.f26915n) != null) {
                return pVar.b();
            }
        }
        return true;
    }

    public final s b() {
        Socket socketK;
        q qVar;
        o oVar = this.f26912k.f26875h;
        if (oVar == null) {
            qVar = null;
        } else {
            boolean zI = oVar.i(this.f26913l);
            synchronized (oVar) {
                try {
                    if (zI) {
                        socketK = (oVar.f26894j || !f(oVar.f26887c.f21794a.f21716h)) ? this.f26912k.k() : null;
                    } else {
                        oVar.f26894j = true;
                        socketK = this.f26912k.k();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f26912k.f26875h == null) {
                if (socketK != null) {
                    wg.g.b(socketK);
                }
                qVar = null;
            } else {
                if (socketK != null) {
                    throw new IllegalStateException("Check failed.");
                }
                qVar = new q(oVar);
            }
        }
        if (qVar != null) {
            return qVar;
        }
        q qVarE = e(null, null);
        if (qVarE != null) {
            return qVarE;
        }
        if (!this.f26917p.isEmpty()) {
            return (s) this.f26917p.removeFirst();
        }
        d dVarC = c();
        q qVarE2 = e(dVarC, dVarC.f26834k);
        return qVarE2 != null ? qVarE2 : dVarC;
    }

    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, java.util.List] */
    public final d c() throws IOException {
        String hostAddress;
        int port;
        List listG;
        boolean zContains;
        g0 g0Var = this.f26916o;
        if (g0Var != null) {
            this.f26916o = null;
            return d(g0Var, null);
        }
        b7.m mVar = this.f26914m;
        if (mVar != null && mVar.f1958b < ((ArrayList) mVar.f1959c).size()) {
            int i10 = mVar.f1958b;
            ArrayList arrayList = (ArrayList) mVar.f1959c;
            if (i10 >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i11 = mVar.f1958b;
            mVar.f1958b = i11 + 1;
            return d((g0) arrayList.get(i11), null);
        }
        c7.p pVar = this.f26915n;
        if (pVar == null) {
            pVar = new c7.p(this.f26910i, this.f26911j, this.f26912k, this.f26909h);
            this.f26915n = pVar;
        }
        if (!pVar.b()) {
            throw new IOException("exhausted all routes");
        }
        if (!pVar.b()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (pVar.f3680a < ((List) pVar.f3685f).size()) {
            ug.a aVar = (ug.a) pVar.f3683d;
            if (pVar.f3680a >= ((List) pVar.f3685f).size()) {
                throw new SocketException("No route to " + aVar.f21716h.f21872d + "; exhausted proxy configurations: " + ((List) pVar.f3685f));
            }
            List list = (List) pVar.f3685f;
            int i12 = pVar.f3680a;
            pVar.f3680a = i12 + 1;
            Proxy proxy = (Proxy) list.get(i12);
            ArrayList arrayList3 = new ArrayList();
            pVar.f3682c = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                t tVar = aVar.f21716h;
                hostAddress = tVar.f21872d;
                port = tVar.f21873e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostAddress = inetSocketAddress.getHostName();
                    jc.l.d(hostAddress, "getHostName(...)");
                } else {
                    hostAddress = address.getHostAddress();
                    jc.l.d(hostAddress, "getHostAddress(...)");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(hostAddress, port));
            } else {
                ef.l lVar = wg.d.f24226a;
                jc.l.e(hostAddress, "<this>");
                if (wg.d.f24226a.d(hostAddress)) {
                    listG = ud.b.w(InetAddress.getByName(hostAddress));
                } else {
                    List listA = aVar.f21709a.a(hostAddress);
                    if (listA.isEmpty()) {
                        throw new UnknownHostException(aVar.f21709a + " returned no addresses for " + hostAddress);
                    }
                    listG = listA;
                }
                if (pVar.f3681b && listG.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : listG) {
                        if (((InetAddress) obj) instanceof Inet6Address) {
                            arrayList4.add(obj);
                        } else {
                            arrayList5.add(obj);
                        }
                    }
                    if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                        byte[] bArr = wg.e.f24227a;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        wb.b bVarL = ud.b.l();
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                bVarL.add(it.next());
                            }
                            if (it2.hasNext()) {
                                bVarL.add(it2.next());
                            }
                        }
                        listG = ud.b.g(bVarL);
                    }
                }
                Iterator it3 = listG.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), port));
                }
            }
            Iterator it4 = pVar.f3682c.iterator();
            while (it4.hasNext()) {
                g0 g0Var2 = new g0((ug.a) pVar.f3683d, proxy, (InetSocketAddress) it4.next());
                xa.h hVar = (xa.h) pVar.f3684e;
                synchronized (hVar) {
                    zContains = ((LinkedHashSet) hVar.f24888a).contains(g0Var2);
                }
                if (zContains) {
                    ((ArrayList) pVar.f3686g).add(g0Var2);
                } else {
                    arrayList2.add(g0Var2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            vb.m.P(arrayList2, (ArrayList) pVar.f3686g);
            ((ArrayList) pVar.f3686g).clear();
        }
        b7.m mVar2 = new b7.m(arrayList2);
        this.f26914m = mVar2;
        if (this.f26912k.f26883p) {
            throw new IOException("Canceled");
        }
        if (mVar2.f1958b >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i13 = mVar2.f1958b;
        mVar2.f1958b = i13 + 1;
        return d((g0) arrayList2.get(i13), arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zg.d d(ug.g0 r30, java.util.ArrayList r31) throws java.net.UnknownServiceException {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.p.d(ug.g0, java.util.ArrayList):zg.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x0038, B:22:0x0045, B:25:0x004c), top: B:51:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zg.q e(zg.d r11, java.util.List r12) {
        /*
            r10 = this;
            h9.b r0 = r10.f26903b
            boolean r1 = r10.f26913l
            ug.a r2 = r10.f26910i
            zg.n r3 = r10.f26912k
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.a()
            if (r6 == 0) goto L14
            r6 = 1
            goto L15
        L14:
            r6 = 0
        L15:
            r0.getClass()
            java.io.Serializable r0 = r0.f8237d
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r7 = "iterator(...)"
            jc.l.d(r0, r7)
        L25:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r0.next()
            zg.o r7 = (zg.o) r7
            jc.l.b(r7)
            monitor-enter(r7)
            if (r6 == 0) goto L45
            ch.p r9 = r7.f26893i     // Catch: java.lang.Throwable -> L43
            if (r9 == 0) goto L3e
            r9 = 1
            goto L3f
        L3e:
            r9 = 0
        L3f:
            if (r9 != 0) goto L45
        L41:
            r9 = 0
            goto L50
        L43:
            r11 = move-exception
            goto L6b
        L45:
            boolean r9 = r7.g(r2, r12)     // Catch: java.lang.Throwable -> L43
            if (r9 != 0) goto L4c
            goto L41
        L4c:
            r3.b(r7)     // Catch: java.lang.Throwable -> L43
            r9 = 1
        L50:
            monitor-exit(r7)
            if (r9 == 0) goto L25
            boolean r9 = r7.i(r1)
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            monitor-enter(r7)
            r7.f26894j = r5     // Catch: java.lang.Throwable -> L68
            java.net.Socket r8 = r3.k()     // Catch: java.lang.Throwable -> L68
            monitor-exit(r7)
            if (r8 == 0) goto L25
            wg.g.b(r8)
            goto L25
        L68:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        L6b:
            monitor-exit(r7)
            throw r11
        L6d:
            r7 = r8
        L6e:
            if (r7 != 0) goto L71
            return r8
        L71:
            if (r11 == 0) goto L7e
            ug.g0 r12 = r11.f26833j
            r10.f26916o = r12
            java.net.Socket r11 = r11.f26840q
            if (r11 == 0) goto L7e
            wg.g.b(r11)
        L7e:
            zg.q r11 = new zg.q
            r11.<init>(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.p.e(zg.d, java.util.List):zg.q");
    }

    public final boolean f(t tVar) {
        jc.l.e(tVar, "url");
        t tVar2 = this.f26910i.f21716h;
        return tVar.f21873e == tVar2.f21873e && jc.l.a(tVar.f21872d, tVar2.f21872d);
    }
}
