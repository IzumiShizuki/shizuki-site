package tc;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import b0.w1;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import lh.f0;
import lh.g0;
import m0.f7;
import m7.k0;
import r.y1;
import r5.h0;
import s.v0;
import s.y0;
import u.o0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements o0, o6.d, y6.a0, g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f20618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f20619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f20620d;

    public b0() {
        this.f20617a = 1;
        this.f20618b = new byte[2];
        this.f20619c = new byte[4];
        this.f20620d = new byte[8];
    }

    public static void j(InputStream inputStream, byte[] bArr, int i10) throws og.a {
        if (n7.d.y(inputStream, bArr, 0, i10) != i10) {
            throw new og.a("Could not fill buffer");
        }
    }

    public static int l(byte[] bArr, int i10) {
        return ((((bArr[i10 + 3] & 255) << 8) | (bArr[i10 + 2] & 255)) << 16) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8);
    }

    public static int o(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    @Override // o6.d
    public int a(long j10) {
        long[] jArr = (long[]) this.f20620d;
        int iA = p4.c0.a(jArr, j10, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // y6.a0
    public void b(p4.s sVar) {
        long jD;
        p4.c.j((p4.y) this.f20619c);
        int i10 = p4.c0.f16548a;
        p4.y yVar = (p4.y) this.f20619c;
        synchronized (yVar) {
            try {
                long j10 = yVar.f16630c;
                jD = j10 != -9223372036854775807L ? j10 + yVar.f16629b : yVar.d();
            } finally {
            }
        }
        long jE = ((p4.y) this.f20619c).e();
        if (jD == -9223372036854775807L || jE == -9223372036854775807L) {
            return;
        }
        m4.q qVar = (m4.q) this.f20618b;
        if (jE != qVar.f14549s) {
            m4.p pVarA = qVar.a();
            pVarA.f14493r = jE;
            m4.q qVar2 = new m4.q(pVarA);
            this.f20618b = qVar2;
            ((h0) this.f20620d).b(qVar2);
        }
        int iA = sVar.a();
        ((h0) this.f20620d).e(iA, sVar);
        ((h0) this.f20620d).a(jD, 1, iA, 0, null);
    }

    @Override // y6.a0
    public void c(p4.y yVar, r5.q qVar, k0 k0Var) {
        this.f20619c = yVar;
        k0Var.b();
        k0Var.d();
        h0 h0VarU = qVar.u(k0Var.f14908c, 5);
        this.f20620d = h0VarU;
        h0VarU.b((m4.q) this.f20618b);
    }

    @Override // u.o0
    public Object d(v0 v0Var, ic.n nVar, yb.c cVar) {
        Object objK = hf.a0.k(new q.q(this, v0Var, nVar, (yb.c) null), cVar);
        return objK == zb.a.f26667a ? objK : ub.a0.f21526a;
    }

    @Override // o6.d
    public long e(int i10) {
        long[] jArr = (long[]) this.f20620d;
        p4.c.c(i10 >= 0);
        p4.c.c(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // o6.d
    public List f(long j10) {
        List list = (List) this.f20618b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.f20619c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                x6.c cVar = (x6.c) list.get(i10);
                o4.b bVar = cVar.f24803a;
                if (bVar.f16201e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new androidx.media3.exoplayer.offline.i(22));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            o4.a aVarA = ((x6.c) arrayList2.get(i12)).f24803a.a();
            aVarA.f16175e = (-1) - i12;
            aVarA.f16176f = 1;
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    @Override // o6.d
    public int g() {
        return ((long[]) this.f20620d).length;
    }

    public String h(long j10, String str, long j11, int i10) {
        ArrayList arrayList = (ArrayList) this.f20618b;
        ArrayList arrayList2 = (ArrayList) this.f20620d;
        ArrayList arrayList3 = (ArrayList) this.f20619c;
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            sb.append((String) arrayList.get(i11));
            if (((Integer) arrayList3.get(i11)).intValue() == 1) {
                sb.append(str);
            } else if (((Integer) arrayList3.get(i11)).intValue() == 2) {
                sb.append(String.format(Locale.US, (String) arrayList2.get(i11), Long.valueOf(j10)));
            } else if (((Integer) arrayList3.get(i11)).intValue() == 3) {
                sb.append(String.format(Locale.US, (String) arrayList2.get(i11), Integer.valueOf(i10)));
            } else if (((Integer) arrayList3.get(i11)).intValue() == 4) {
                sb.append(String.format(Locale.US, (String) arrayList2.get(i11), Long.valueOf(j11)));
            }
        }
        sb.append((String) arrayList.get(arrayList3.size()));
        return sb.toString();
    }

    public void i(r5.q qVar, k0 k0Var) {
        h0[] h0VarArr = (h0[]) this.f20619c;
        for (int i10 = 0; i10 < h0VarArr.length; i10++) {
            k0Var.b();
            k0Var.d();
            h0 h0VarU = qVar.u(k0Var.f14908c, 3);
            m4.q qVar2 = (m4.q) ((List) this.f20618b).get(i10);
            String str = qVar2.f14544n;
            p4.c.b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = qVar2.f14531a;
            if (str2 == null) {
                k0Var.d();
                str2 = (String) k0Var.f14910e;
            }
            m4.p pVar = new m4.p();
            pVar.f14476a = str2;
            pVar.f14487l = m4.o0.p("video/mp2t");
            pVar.f14488m = m4.o0.p(str);
            pVar.f14480e = qVar2.f14535e;
            pVar.f14479d = qVar2.f14534d;
            pVar.H = qVar2.I;
            pVar.f14491p = qVar2.f14547q;
            a0.c.O(pVar, h0VarU);
            h0VarArr[i10] = h0VarU;
        }
    }

    public int k(PushbackInputStream pushbackInputStream) throws og.a {
        byte[] bArr = (byte[]) this.f20619c;
        j(pushbackInputStream, bArr, 4);
        return l(bArr, 0);
    }

    @Override // lh.g0
    public lh.h0 m() {
        return (lh.b0) this.f20619c;
    }

    public long n(byte[] bArr, int i10) {
        byte[] bArr2 = (byte[]) this.f20620d;
        if (bArr.length - i10 < 8) {
            Arrays.fill(bArr2, (byte) 0);
        }
        System.arraycopy(bArr, i10, bArr2, 0, Math.min(bArr.length - i10, 8));
        return (((((((((((((((long) (bArr2[7] & 255)) << 8) | ((long) (bArr2[6] & 255))) << 8) | ((long) (bArr2[5] & 255))) << 8) | ((long) (bArr2[4] & 255))) << 8) | ((long) (bArr2[3] & 255))) << 8) | ((long) (bArr2[2] & 255))) << 8) | ((long) (bArr2[1] & 255))) << 8) | ((long) (bArr2[0] & 255));
    }

    public String toString() {
        switch (this.f20617a) {
            case 7:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f20618b);
                sb.append('{');
                v2.e eVar = (v2.e) ((v2.e) this.f20619c).f22365c;
                String str = "";
                while (eVar != null) {
                    Object obj = eVar.f22364b;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    eVar = (v2.e) eVar.f22365c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // lh.g0
    public f0 v() {
        return (lh.a0) this.f20620d;
    }

    public b0(w1 w1Var) {
        this.f20617a = 13;
        this.f20618b = w1Var;
        this.f20619c = g8.a.l((mh.e) w1Var.f1397e);
        this.f20620d = g8.a.k((mh.d) w1Var.f1394b);
    }

    public b0(ArrayList arrayList) {
        this.f20617a = 6;
        this.f20618b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f20619c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            x6.c cVar = (x6.c) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.f20619c;
            jArr[i11] = cVar.f24804b;
            jArr[i11 + 1] = cVar.f24805c;
        }
        long[] jArr2 = (long[]) this.f20619c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f20620d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public b0(List list) {
        this.f20617a = 10;
        this.f20618b = list;
        this.f20619c = new h0[list.size()];
        this.f20620d = new h7.i(new y6.c0(this));
    }

    public b0(View view) {
        this.f20617a = 8;
        this.f20618b = view;
        this.f20619c = ub.a.c(ub.i.f21541b, new r2.a(13, this));
        this.f20620d = new y1(view);
    }

    public b0(yc.i iVar, List list, b0 b0Var) {
        this.f20617a = 11;
        jc.l.e(iVar, "classifierDescriptor");
        jc.l.e(list, "arguments");
        this.f20618b = iVar;
        this.f20619c = list;
        this.f20620d = b0Var;
    }

    public b0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f20617a = 12;
        this.f20618b = arrayList;
        this.f20619c = arrayList2;
        this.f20620d = arrayList3;
    }

    public b0(oc.d dVar, List[] listArr, Method method) {
        this.f20617a = 0;
        jc.l.e(dVar, "argumentRange");
        this.f20618b = dVar;
        this.f20619c = listArr;
        this.f20620d = method;
    }

    public b0(int i10, String str) {
        this.f20617a = i10;
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                m4.p pVar = new m4.p();
                pVar.f14487l = m4.o0.p("video/mp2t");
                pVar.f14488m = m4.o0.p(str);
                this.f20618b = new m4.q(pVar);
                break;
            default:
                v2.e eVar = new v2.e(11, false);
                this.f20619c = eVar;
                this.f20620d = eVar;
                this.f20618b = str;
                break;
        }
    }

    public b0(n4.f[] fVarArr) {
        this.f20617a = 3;
        x4.z zVar = new x4.z();
        n4.i iVar = new n4.i();
        iVar.f15303c = 1.0f;
        iVar.f15304d = 1.0f;
        n4.d dVar = n4.d.f15266e;
        iVar.f15305e = dVar;
        iVar.f15306f = dVar;
        iVar.f15307g = dVar;
        iVar.f15308h = dVar;
        ByteBuffer byteBuffer = n4.f.f15271a;
        iVar.f15311k = byteBuffer;
        iVar.f15312l = byteBuffer.asShortBuffer();
        iVar.f15313m = byteBuffer;
        iVar.f15302b = -1;
        n4.f[] fVarArr2 = new n4.f[fVarArr.length + 2];
        this.f20618b = fVarArr2;
        System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
        this.f20619c = zVar;
        this.f20620d = iVar;
        fVarArr2[fVarArr.length] = zVar;
        fVarArr2[fVarArr.length + 1] = iVar;
    }

    public b0(f7 f7Var) {
        this.f20617a = 2;
        this.f20618b = f7Var;
        this.f20619c = new m0.v(2, this);
        this.f20620d = new y0();
    }

    public b0(AudioTrack audioTrack, x4.e eVar) {
        this.f20617a = 4;
        this.f20618b = audioTrack;
        this.f20619c = eVar;
        this.f20620d = new AudioRouting.OnRoutingChangedListener() { // from class: x4.s
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                tc.b0 b0Var = this.f24686a;
                if (((s) b0Var.f20620d) == null || audioRouting.getRoutedDevice() == null) {
                    return;
                }
                ((e) b0Var.f20619c).b(audioRouting.getRoutedDevice());
            }
        };
        audioTrack.addOnRoutingChangedListener((x4.s) this.f20620d, new Handler(Looper.myLooper()));
    }

    public b0(x4.v vVar) {
        this.f20617a = 5;
        this.f20620d = vVar;
        this.f20618b = new Handler(Looper.myLooper());
        this.f20619c = new x4.u(this);
    }
}
