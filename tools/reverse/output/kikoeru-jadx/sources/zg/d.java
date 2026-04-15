package zg;

import b0.w1;
import b7.b1;
import g5.w;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import lh.a0;
import lh.j0;
import q.t0;
import tc.b0;
import ug.c0;
import ug.d0;
import ug.g0;
import ug.t;
import ug.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements s, ah.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yg.c f26824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.b f26825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f26831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f26832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g0 f26833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f26834k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b1 f26835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f26836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f26837n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f26838o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Socket f26839p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Socket f26840q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ug.q f26841r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y f26842s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b0 f26843t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o f26844u;

    public d(yg.c cVar, h9.b bVar, int i10, int i11, int i12, int i13, boolean z10, n nVar, p pVar, g0 g0Var, List list, b1 b1Var, int i14, boolean z11) {
        jc.l.e(cVar, "taskRunner");
        jc.l.e(bVar, "connectionPool");
        jc.l.e(g0Var, "route");
        this.f26824a = cVar;
        this.f26825b = bVar;
        this.f26826c = i10;
        this.f26827d = i11;
        this.f26828e = i12;
        this.f26829f = i13;
        this.f26830g = z10;
        this.f26831h = nVar;
        this.f26832i = pVar;
        this.f26833j = g0Var;
        this.f26834k = list;
        this.f26835l = b1Var;
        this.f26836m = i14;
        this.f26837n = z11;
    }

    @Override // zg.s
    public final boolean a() {
        return this.f26842s != null;
    }

    @Override // zg.s
    public final s b() {
        return new d(this.f26824a, this.f26825b, this.f26826c, this.f26827d, this.f26828e, this.f26829f, this.f26830g, this.f26831h, this.f26832i, this.f26833j, this.f26834k, this.f26835l, this.f26836m, this.f26837n);
    }

    @Override // zg.s
    public final o c() {
        this.f26831h.f26868a.B.i(this.f26833j);
        o oVar = this.f26844u;
        jc.l.b(oVar);
        jc.l.e(this.f26833j, "route");
        q qVarE = this.f26832i.e(this, this.f26834k);
        if (qVarE != null) {
            return qVarE.f26918a;
        }
        synchronized (oVar) {
            h9.b bVar = this.f26825b;
            bVar.getClass();
            TimeZone timeZone = wg.g.f24231a;
            ((ConcurrentLinkedQueue) bVar.f8237d).add(oVar);
            ((yg.b) bVar.f8235b).d((xg.e) bVar.f8236c, 0L);
            this.f26831h.b(oVar);
        }
        return oVar;
    }

    @Override // zg.s, ah.e
    public final void cancel() {
        this.f26838o = true;
        Socket socket = this.f26839p;
        if (socket != null) {
            wg.g.b(socket);
        }
    }

    @Override // zg.s
    public final r d() {
        Socket socket;
        Socket socket2;
        h9.b bVar = this.f26825b;
        g0 g0Var = this.f26833j;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f26831h.f26885r;
        if (this.f26839p != null) {
            throw new IllegalStateException("TCP already connected");
        }
        copyOnWriteArrayList.add(this);
        boolean z10 = false;
        try {
            try {
                jc.l.e(g0Var.f21796c, "inetSocketAddress");
                bVar.getClass();
                i();
                z10 = true;
                r rVar = new r(this, (Throwable) null, 6);
                copyOnWriteArrayList.remove(this);
                return rVar;
            } catch (IOException e10) {
                ug.a aVar = g0Var.f21794a;
                if (g0Var.f21795b.type() != Proxy.Type.DIRECT) {
                    ug.a aVar2 = g0Var.f21794a;
                    aVar2.f21715g.connectFailed(aVar2.f21716h.i(), g0Var.f21795b.address(), e10);
                }
                jc.l.e(g0Var.f21796c, "inetSocketAddress");
                bVar.getClass();
                r rVar2 = new r(this, e10, 2);
                copyOnWriteArrayList.remove(this);
                if (!z10 && (socket = this.f26839p) != null) {
                    wg.g.b(socket);
                }
                return rVar2;
            }
        } catch (Throwable th2) {
            copyOnWriteArrayList.remove(this);
            if (!z10 && (socket2 = this.f26839p) != null) {
                wg.g.b(socket2);
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    @Override // zg.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zg.r g() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.d.g():zg.r");
    }

    @Override // ah.e
    public final g0 h() {
        return this.f26833j;
    }

    public final void i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.f26833j.f21795b.type();
        int i10 = type == null ? -1 : c.f26823a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            socketCreateSocket = this.f26833j.f21794a.f21710b.createSocket();
            jc.l.b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(this.f26833j.f21795b);
        }
        this.f26839p = socketCreateSocket;
        if (this.f26838o) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f26829f);
        try {
            fh.e eVar = fh.e.f7102a;
            fh.e.f7102a.f(socketCreateSocket, this.f26833j.f21796c, this.f26828e);
            try {
                this.f26843t = new b0(new w1(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (jc.l.a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f26833j.f21796c);
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, ug.n nVar) {
        String strG;
        y yVarF;
        ug.a aVar = this.f26833j.f21794a;
        try {
            if (nVar.f21837b) {
                fh.e eVar = fh.e.f7102a;
                fh.e.f7102a.e(sSLSocket, aVar.f21716h.f21872d, aVar.f21717i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            jc.l.b(session);
            ug.q qVarN = ud.b.n(session);
            HostnameVerifier hostnameVerifier = aVar.f21712d;
            jc.l.b(hostnameVerifier);
            boolean zVerify = hostnameVerifier.verify(aVar.f21716h.f21872d, session);
            int i10 = 0;
            if (zVerify) {
                ug.j jVar = aVar.f21713e;
                jc.l.b(jVar);
                this.f26841r = new ug.q(qVarN.f21855a, qVarN.f21856b, qVarN.f21857c, new b(jVar, qVarN, aVar, i10));
                jc.l.e(aVar.f21716h.f21872d, "hostname");
                Iterator it = jVar.f21807a.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                if (nVar.f21837b) {
                    fh.e eVar2 = fh.e.f7102a;
                    strG = fh.e.f7102a.g(sSLSocket);
                } else {
                    strG = null;
                }
                this.f26840q = sSLSocket;
                this.f26843t = new b0(new w1(sSLSocket));
                if (strG != null) {
                    y.f21933b.getClass();
                    yVarF = ug.b.f(strG);
                } else {
                    yVarF = y.f21935d;
                }
                this.f26842s = yVarF;
                fh.e eVar3 = fh.e.f7102a;
                fh.e.f7102a.getClass();
                return;
            }
            List listA = qVarN.a();
            if (listA.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + aVar.f21716h.f21872d + " not verified (no certificates)");
            }
            Object obj = listA.get(0);
            jc.l.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(aVar.f21716h.f21872d);
            sb.append(" not verified:\n            |    certificate: ");
            ug.j jVar2 = ug.j.f21806c;
            lh.i iVar = lh.i.f12572d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            jc.l.d(encoded, "getEncoded(...)");
            sb.append("sha256/".concat(lh.a.a(w.x(encoded).c("SHA-256").f12573a, lh.a.f12539a)));
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(vb.m.q0(jh.c.a(x509Certificate, 7), jh.c.a(x509Certificate, 2)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(ef.o.a0(sb.toString()));
        } catch (Throwable th2) {
            fh.e eVar4 = fh.e.f7102a;
            fh.e.f7102a.getClass();
            wg.g.b(sSLSocket);
            throw th2;
        }
    }

    public final r k() throws IOException {
        b1 b1Var = this.f26835l;
        jc.l.b(b1Var);
        g0 g0Var = this.f26833j;
        String str = "CONNECT " + wg.g.h(g0Var.f21794a.f21716h, true) + " HTTP/1.1";
        b0 b0Var = this.f26843t;
        if (b0Var == null) {
            jc.l.k("socket");
            throw null;
        }
        bh.h hVar = new bh.h(null, this, b0Var);
        b0 b0Var2 = this.f26843t;
        if (b0Var2 == null) {
            jc.l.k("socket");
            throw null;
        }
        j0 j0VarA = ((lh.b0) b0Var2.f20619c).f12544a.a();
        long j10 = this.f26826c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        j0VarA.g(j10);
        b0 b0Var3 = this.f26843t;
        if (b0Var3 == null) {
            jc.l.k("socket");
            throw null;
        }
        ((a0) b0Var3.f20620d).f12541a.a().g(this.f26827d);
        hVar.l((ug.r) b1Var.f1652d, str);
        hVar.a();
        c0 c0VarD = hVar.d(false);
        jc.l.b(c0VarD);
        c0VarD.f21729a = b1Var;
        d0 d0VarA = c0VarD.a();
        int i10 = d0VarA.f21759d;
        long jD = wg.g.d(d0VarA);
        if (jD != -1) {
            bh.e eVarK = hVar.k((t) d0VarA.f21756a.f1650b, jD);
            wg.g.f(eVarK, Integer.MAX_VALUE);
            eVarK.close();
        }
        if (i10 == 200) {
            return new r(this, (Throwable) null, 6);
        }
        if (i10 != 407) {
            throw new IOException(t0.B(i10, "Unexpected response code for CONNECT: "));
        }
        g0Var.f21794a.f21714f.getClass();
        throw new IOException("Failed to authenticate with proxy");
    }

    public final d l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        jc.l.e(list, "connectionSpecs");
        int i10 = this.f26836m;
        int size = list.size();
        for (int i11 = i10 + 1; i11 < size; i11++) {
            ug.n nVar = (ug.n) list.get(i11);
            nVar.getClass();
            if (nVar.f21836a && (((strArr = nVar.f21839d) == null || wg.e.g(strArr, sSLSocket.getEnabledProtocols(), xb.a.f24897b)) && ((strArr2 = nVar.f21838c) == null || wg.e.g(strArr2, sSLSocket.getEnabledCipherSuites(), ug.l.f21810c)))) {
                return new d(this.f26824a, this.f26825b, this.f26826c, this.f26827d, this.f26828e, this.f26829f, this.f26830g, this.f26831h, this.f26832i, this.f26833j, this.f26834k, this.f26835l, i11, i10 != -1);
            }
        }
        return null;
    }

    public final d m(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        jc.l.e(list, "connectionSpecs");
        if (this.f26836m != -1) {
            return this;
        }
        d dVarL = l(list, sSLSocket);
        if (dVarL != null) {
            return dVarL;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f26837n);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        jc.l.b(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        jc.l.d(string, "toString(...)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // ah.e
    public final void f() {
    }

    @Override // ah.e
    public final void e(n nVar, IOException iOException) {
    }
}
