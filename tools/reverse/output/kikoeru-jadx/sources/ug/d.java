package ug;

import b7.b1;
import hd.q0;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f21744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f21745l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f21746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f21747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f21749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f21751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f21752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f21753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f21754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f21755j;

    static {
        fh.e eVar = fh.e.f7102a;
        fh.e.f7102a.getClass();
        f21744k = "OkHttp-Sent-Millis";
        fh.e.f7102a.getClass();
        f21745l = "OkHttp-Received-Millis";
    }

    public d(lh.h0 h0Var) throws IOException {
        t tVarB;
        h0 h0VarE;
        jc.l.e(h0Var, "rawSource");
        try {
            lh.b0 b0VarL = g8.a.l(h0Var);
            String strX = b0VarL.x(Long.MAX_VALUE);
            try {
                s sVar = new s();
                sVar.d(null, strX);
                tVarB = sVar.b();
            } catch (IllegalArgumentException unused) {
                tVarB = null;
            }
            if (tVarB == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(strX));
                fh.e eVar = fh.e.f7102a;
                fh.e.f7102a.j("cache corruption", 5, iOException);
                throw iOException;
            }
            this.f21746a = tVarB;
            this.f21748c = b0VarL.x(Long.MAX_VALUE);
            q0 q0Var = new q0((byte) 0, 5);
            int iX = ud.s.x(b0VarL);
            for (int i10 = 0; i10 < iX; i10++) {
                q0Var.h(b0VarL.x(Long.MAX_VALUE));
            }
            this.f21747b = q0Var.k();
            ah.j jVarI = lc.b.I(b0VarL.x(Long.MAX_VALUE));
            this.f21749d = (y) jVarI.f391c;
            this.f21750e = jVarI.f390b;
            this.f21751f = (String) jVarI.f392d;
            q0 q0Var2 = new q0((byte) 0, 5);
            int iX2 = ud.s.x(b0VarL);
            for (int i11 = 0; i11 < iX2; i11++) {
                q0Var2.h(b0VarL.x(Long.MAX_VALUE));
            }
            String str = f21744k;
            String strO = q0Var2.o(str);
            String str2 = f21745l;
            String strO2 = q0Var2.o(str2);
            q0Var2.x(str);
            q0Var2.x(str2);
            this.f21754i = strO != null ? Long.parseLong(strO) : 0L;
            this.f21755j = strO2 != null ? Long.parseLong(strO2) : 0L;
            this.f21752g = q0Var2.k();
            if (this.f21746a.f()) {
                String strX2 = b0VarL.x(Long.MAX_VALUE);
                if (strX2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strX2 + '\"');
                }
                l lVarD = l.f21809b.d(b0VarL.x(Long.MAX_VALUE));
                List listA = a(b0VarL);
                List listA2 = a(b0VarL);
                if (b0VarL.b()) {
                    h0VarE = h0.f21802g;
                } else {
                    b bVar = h0.f21797b;
                    String strX3 = b0VarL.x(Long.MAX_VALUE);
                    bVar.getClass();
                    h0VarE = b.e(strX3);
                }
                this.f21753h = new q(h0VarE, lVarD, wg.g.i(listA2), new sf.j(2, wg.g.i(listA)));
            } else {
                this.f21753h = null;
            }
            h0Var.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                a.a.w(h0Var, th2);
                throw th3;
            }
        }
    }

    public static List a(lh.b0 b0Var) throws IOException {
        int iX = ud.s.x(b0Var);
        if (iX == -1) {
            return vb.r.f22819a;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iX);
            for (int i10 = 0; i10 < iX; i10++) {
                String strX = b0Var.x(Long.MAX_VALUE);
                lh.f fVar = new lh.f();
                lh.i iVar = lh.i.f12572d;
                lh.i iVarR = g5.w.r(strX);
                if (iVarR == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                fVar.X(iVarR);
                arrayList.add(certificateFactory.generateCertificate(new lh.e(fVar, 0)));
            }
            return arrayList;
        } catch (CertificateException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public static void b(lh.a0 a0Var, List list) throws IOException {
        try {
            a0Var.b0(list.size());
            a0Var.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                lh.i iVar = lh.i.f12572d;
                jc.l.b(encoded);
                a0Var.E(lh.a.a(g5.w.x(encoded).f12573a, lh.a.f12539a));
                a0Var.writeByte(10);
            }
        } catch (CertificateEncodingException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public final void c(b5.d0 d0Var) {
        t tVar = this.f21746a;
        q qVar = this.f21753h;
        r rVar = this.f21752g;
        r rVar2 = this.f21747b;
        lh.a0 a0VarK = g8.a.k(d0Var.o(0));
        try {
            a0VarK.E(tVar.f21876h);
            a0VarK.writeByte(10);
            a0VarK.E(this.f21748c);
            a0VarK.writeByte(10);
            a0VarK.b0(rVar2.size());
            a0VarK.writeByte(10);
            int size = rVar2.size();
            for (int i10 = 0; i10 < size; i10++) {
                a0VarK.E(rVar2.i(i10));
                a0VarK.E(": ");
                a0VarK.E(rVar2.k(i10));
                a0VarK.writeByte(10);
            }
            y yVar = this.f21749d;
            int i11 = this.f21750e;
            String str = this.f21751f;
            jc.l.e(yVar, "protocol");
            jc.l.e(str, "message");
            StringBuilder sb = new StringBuilder();
            if (yVar == y.f21934c) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i11);
            sb.append(' ');
            sb.append(str);
            a0VarK.E(sb.toString());
            a0VarK.writeByte(10);
            a0VarK.b0(rVar.size() + 2);
            a0VarK.writeByte(10);
            int size2 = rVar.size();
            for (int i12 = 0; i12 < size2; i12++) {
                a0VarK.E(rVar.i(i12));
                a0VarK.E(": ");
                a0VarK.E(rVar.k(i12));
                a0VarK.writeByte(10);
            }
            a0VarK.E(f21744k);
            a0VarK.E(": ");
            a0VarK.b0(this.f21754i);
            a0VarK.writeByte(10);
            a0VarK.E(f21745l);
            a0VarK.E(": ");
            a0VarK.b0(this.f21755j);
            a0VarK.writeByte(10);
            if (tVar.f()) {
                a0VarK.writeByte(10);
                jc.l.b(qVar);
                a0VarK.E(qVar.f21856b.f21828a);
                a0VarK.writeByte(10);
                b(a0VarK, qVar.a());
                b(a0VarK, qVar.f21857c);
                a0VarK.E(qVar.f21855a.f21804a);
                a0VarK.writeByte(10);
            }
            a0VarK.close();
        } finally {
        }
    }

    public d(d0 d0Var) {
        r rVarK;
        b1 b1Var = d0Var.f21756a;
        this.f21746a = (t) b1Var.f1650b;
        d0 d0Var2 = d0Var.f21764i;
        jc.l.b(d0Var2);
        r rVar = (r) d0Var2.f21756a.f1652d;
        r rVar2 = d0Var.f21761f;
        Set setD = ud.s.D(rVar2);
        if (setD.isEmpty()) {
            rVarK = r.f21859b;
        } else {
            q0 q0Var = new q0((byte) 0, 5);
            int size = rVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strI = rVar.i(i10);
                if (setD.contains(strI)) {
                    q0Var.g(strI, rVar.k(i10));
                }
            }
            rVarK = q0Var.k();
        }
        this.f21747b = rVarK;
        this.f21748c = (String) b1Var.f1651c;
        this.f21749d = d0Var.f21757b;
        this.f21750e = d0Var.f21759d;
        this.f21751f = d0Var.f21758c;
        this.f21752g = rVar2;
        this.f21753h = d0Var.f21760e;
        this.f21754i = d0Var.f21767l;
        this.f21755j = d0Var.f21768m;
    }
}
