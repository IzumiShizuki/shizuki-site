package i7;

import android.graphics.Bitmap;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m0.r4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements k7.c, l0.l, l5.c, lg.b, n5.j, oe.e, z7.b, a8.d, q8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9258a;

    public /* synthetic */ p2(Object obj) {
        this.f9258a = obj;
    }

    public static s8.o B(c7.p pVar, s8.i iVar, q8.b bVar, q8.c cVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(iVar.f19614a.getResources(), cVar.f17916a);
        Map map = cVar.f17917b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = x8.d.f24838a;
        return new s8.o(bitmapDrawable, iVar, j8.f.f10613a, bVar, str, zBooleanValue, pVar != null && pVar.f3681b);
    }

    public static Object j(p2 p2Var, r4 r4Var, ac.i iVar) {
        Object objR = a.a.r((m0.x) p2Var.f9258a, r4Var, ((m0.x) p2Var.f9258a).f13855k.e(), iVar);
        return objR == zb.a.f26667a ? objR : ub.a0.f21526a;
    }

    public static int w(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            i12++;
            if (i12 == i11) {
                i13++;
                i12 = 0;
            } else if (i12 > i11) {
                i13++;
                i12 = 1;
            }
        }
        return i12 + 1 > i11 ? i13 + 1 : i13;
    }

    public q8.b A(s8.i iVar, Object obj, s8.m mVar, h8.c cVar) {
        String strA;
        Map linkedHashMap;
        iVar.getClass();
        List list = iVar.f19619f;
        List list2 = ((h8.h) this.f9258a).f8231g.f8206c;
        int size = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                strA = null;
                break;
            }
            ub.k kVar = (ub.k) list2.get(i10);
            o8.b bVar = (o8.b) kVar.f21543a;
            if (((Class) kVar.f21544b).isAssignableFrom(obj.getClass())) {
                jc.l.c(bVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                strA = bVar.a(obj, mVar);
                if (strA != null) {
                    break;
                }
            }
            i10++;
        }
        if (strA == null) {
            return null;
        }
        Map map = iVar.f19637x.f19657a;
        boolean zIsEmpty = map.isEmpty();
        vb.s sVar = vb.s.f22820a;
        if (zIsEmpty) {
            linkedHashMap = sVar;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
        }
        if (list.isEmpty() && linkedHashMap.isEmpty()) {
            return new q8.b(sVar, strA);
        }
        LinkedHashMap linkedHashMapC = vb.w.C(linkedHashMap);
        List list3 = list;
        if (!list3.isEmpty()) {
            int size2 = list3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                linkedHashMapC.put(q.t0.B(i11, "coil#transformation_"), ((pa.a) list.get(i11)).f16961c);
            }
            linkedHashMapC.put("coil#transformation_size", mVar.f19644d.toString());
        }
        return new q8.b(linkedHashMapC, strA);
    }

    public void C(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f9258a).notifyViewVisibilityChanged(view, i10, z10);
        }
    }

    public yc.e D(ed.o oVar) {
        pd.p pVar;
        jc.l.e(oVar, "javaClass");
        be.c cVarC = oVar.c();
        Class<?> declaringClass = oVar.f6508a.getDeclaringClass();
        ed.o oVar2 = declaringClass != null ? new ed.o(declaringClass) : null;
        if (oVar2 != null) {
            yc.e eVarD = D(oVar2);
            le.o oVarI0 = eVarD != null ? eVarD.I0() : null;
            yc.h hVarA = oVarI0 != null ? oVarI0.a(oVar.e(), gd.b.f7521h) : null;
            if (hVarA instanceof yc.e) {
                return (yc.e) hVarA;
            }
        } else if (cVarC != null && (pVar = (pd.p) vb.m.a0(ud.b.w(((od.d) this.f9258a).c(cVarC.b())))) != null) {
            pd.u uVar = pVar.f17068j.f17005d;
            uVar.getClass();
            return uVar.v(oVar.e(), oVar);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(i7.r1 r5, ac.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof i7.o2
            if (r0 == 0) goto L13
            r0 = r6
            i7.o2 r0 = (i7.o2) r0
            int r1 = r0.f9247g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9247g = r1
            goto L18
        L13:
            i7.o2 r0 = new i7.o2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f9245e
            int r1 = r0.f9247g
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            i7.p2 r5 = r0.f9244d
            ub.a.f(r6)     // Catch: i7.l2 -> L27
            goto L4f
        L27:
            r6 = move-exception
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ub.a.f(r6)
            b0.x r6 = new b0.x     // Catch: i7.l2 -> L49
            r1 = 0
            r3 = 13
            r6.<init>(r4, r5, r1, r3)     // Catch: i7.l2 -> L49
            r0.f9244d = r4     // Catch: i7.l2 -> L49
            r0.f9247g = r2     // Catch: i7.l2 -> L49
            java.lang.Object r5 = hf.a0.k(r6, r0)     // Catch: i7.l2 -> L49
            zb.a r6 = zb.a.f26667a
            if (r5 != r6) goto L4f
            return r6
        L49:
            r6 = move-exception
            r5 = r4
        L4b:
            i7.p2 r0 = r6.f9197a
            if (r0 != r5) goto L52
        L4f:
            ub.a0 r5 = ub.a0.f21526a
            return r5
        L52:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.p2.E(i7.r1, ac.c):java.lang.Object");
    }

    public void F(y2.y yVar, long j10, boolean z10, l0.s sVar) {
        l0.l1 l1Var = (l0.l1) this.f9258a;
        l1Var.o(t2.k0.b(l0.l1.a(l1Var, yVar, j10, z10, false, sVar, false)) ? h0.i0.f7681c : h0.i0.f7680b);
    }

    @Override // q8.h
    public q8.c a(q8.b bVar) {
        return null;
    }

    @Override // l0.l
    public boolean c(long j10, l0.s sVar) {
        h0.u0 u0Var;
        l0.l1 l1Var = (l0.l1) this.f9258a;
        if (!l1Var.i() || l1Var.k().f25434a.f20320b.length() == 0 || (u0Var = l1Var.f11528d) == null || u0Var.d() == null) {
            return false;
        }
        o1.r rVar = l1Var.f11536l;
        if (rVar != null) {
            o1.r.b(rVar);
        }
        l1Var.f11539o = j10;
        l1Var.f11544t = -1;
        l1Var.f(true);
        F(l1Var.k(), l1Var.f11539o, true, sVar);
        return true;
    }

    @Override // a8.d
    public void d(a8.c cVar) {
        q7.e eVar = (q7.e) this.f9258a;
        int length = eVar.f17900d.length;
        for (int i10 = 1; i10 < length; i10++) {
            int i11 = eVar.f17900d[i10];
            if (i11 == 1) {
                cVar.c(i10, eVar.f17901e[i10]);
            } else if (i11 == 2) {
                cVar.Q(eVar.f17902f[i10], i10);
            } else if (i11 == 3) {
                String str = eVar.f17903g[i10];
                jc.l.b(str);
                cVar.m(i10, str);
            } else if (i11 == 4) {
                byte[] bArr = eVar.f17904h[i10];
                jc.l.b(bArr);
                cVar.d(bArr, i10);
            } else if (i11 == 5) {
                cVar.e(i10);
            }
        }
    }

    @Override // k7.c
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // k7.c
    public void f(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            default:
                str = "";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f9258a).setResultCode(i10);
    }

    @Override // lg.b
    public int g(byte[] bArr, int i10, int i11) throws og.a {
        ng.b bVar = (ng.b) this.f9258a;
        if (i10 < 0 || i11 < 0) {
            throw new og.a("one of the input parameters were null in standard decrypt data");
        }
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            byte bA = (byte) (((bArr[i12] & 255) ^ bVar.a()) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
            bVar.b(bA);
            bArr[i12] = bA;
        }
        return i11;
    }

    @Override // l0.l
    public boolean i(long j10, l0.s sVar) {
        h0.u0 u0Var;
        l0.l1 l1Var = (l0.l1) this.f9258a;
        if (!l1Var.i() || l1Var.k().f25434a.f20320b.length() == 0 || (u0Var = l1Var.f11528d) == null || u0Var.d() == null) {
            return false;
        }
        F(l1Var.k(), j10, false, sVar);
        return true;
    }

    @Override // n5.j
    public void k(n5.l lVar, long j10, long j11) {
        boolean z10;
        y4.d dVar = (y4.d) this.f9258a;
        synchronized (o5.b.f16239b) {
            z10 = o5.b.f16240c;
        }
        if (z10) {
            dVar.a();
        } else {
            dVar.f25476b.x(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // z7.b
    public z7.a l(String str) {
        jc.l.e(str, "fileName");
        return new q7.a(((a8.b) this.f9258a).getWritableDatabase());
    }

    public void m(int i10, int i11, r5.o oVar) throws m4.p0 {
        char c3;
        char c10;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        j6.d dVar = (j6.d) this.f9258a;
        j6.e eVar = dVar.f10546b;
        SparseArray sparseArray = dVar.f10548c;
        p4.s sVar = dVar.f10559k;
        p4.s sVar2 = dVar.f10557i;
        int i16 = 1;
        int i17 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (dVar.J != 2) {
                    return;
                }
                j6.c cVar = (j6.c) sparseArray.get(dVar.P);
                int i18 = dVar.S;
                p4.s sVar3 = dVar.f10564p;
                if (i18 != 4 || !"V_VP9".equals(cVar.f10514c)) {
                    oVar.r(i11);
                    return;
                } else {
                    sVar3.D(i11);
                    oVar.readFully(sVar3.f16611a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                dVar.d(i10);
                j6.c cVar2 = dVar.f10572x;
                int i19 = cVar2.f10519h;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    oVar.r(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                cVar2.P = bArr;
                oVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                dVar.d(i10);
                byte[] bArr2 = new byte[i11];
                dVar.f10572x.f10521j = bArr2;
                oVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                oVar.readFully(bArr3, 0, i11);
                dVar.d(i10);
                dVar.f10572x.f10522k = new r5.g0(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(sVar.f16611a, (byte) 0);
                oVar.readFully(sVar.f16611a, 4 - i11, i11);
                sVar.G(0);
                dVar.f10574z = (int) sVar.w();
                return;
            }
            if (i10 == 25506) {
                dVar.d(i10);
                byte[] bArr4 = new byte[i11];
                dVar.f10572x.f10523l = bArr4;
                oVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw m4.p0.a(null, "Unexpected id: " + i10);
            }
            dVar.d(i10);
            byte[] bArr5 = new byte[i11];
            dVar.f10572x.f10535x = bArr5;
            oVar.readFully(bArr5, 0, i11);
            return;
        }
        if (dVar.J == 0) {
            dVar.P = (int) eVar.b(oVar, false, true, 8);
            dVar.Q = eVar.f10578c;
            dVar.L = -9223372036854775807L;
            dVar.J = 1;
            sVar2.D(0);
        }
        j6.c cVar3 = (j6.c) sparseArray.get(dVar.P);
        if (cVar3 == null) {
            oVar.r(i11 - dVar.Q);
            dVar.J = 0;
            return;
        }
        cVar3.Z.getClass();
        if (dVar.J == 1) {
            dVar.l(oVar, 3);
            int i20 = (sVar2.f16611a[2] & 6) >> 1;
            byte b10 = 255;
            if (i20 == 0) {
                dVar.N = 1;
                int[] iArr = dVar.O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.O = iArr;
                iArr[0] = (i11 - dVar.Q) - 3;
            } else {
                dVar.l(oVar, 4);
                int i21 = (sVar2.f16611a[3] & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) + 1;
                dVar.N = i21;
                int[] iArr2 = dVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[i21];
                } else if (iArr2.length < i21) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i21)];
                }
                dVar.O = iArr2;
                if (i20 == 2) {
                    int i22 = (i11 - dVar.Q) - 4;
                    int i23 = dVar.N;
                    Arrays.fill(iArr2, 0, i23, i22 / i23);
                } else {
                    if (i20 != 1) {
                        if (i20 != 3) {
                            throw m4.p0.a(null, "Unexpected lacing value: " + i20);
                        }
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            int i27 = dVar.N - i16;
                            if (i24 >= i27) {
                                c3 = 1;
                                c10 = 0;
                                dVar.O[i27] = ((i11 - dVar.Q) - i26) - i25;
                                break;
                            }
                            dVar.O[i24] = i17;
                            int i28 = i26 + 1;
                            dVar.l(oVar, i28);
                            if (sVar2.f16611a[i26] == 0) {
                                throw m4.p0.a(null, "No valid varint length mask found");
                            }
                            int i29 = 0;
                            while (true) {
                                if (i29 >= 8) {
                                    j10 = 0;
                                    i12 = i28;
                                    break;
                                }
                                int i30 = 1 << (7 - i29);
                                if ((sVar2.f16611a[i26] & i30) != 0) {
                                    i12 = i28 + i29;
                                    dVar.l(oVar, i12);
                                    j10 = sVar2.f16611a[i26] & b10 & (~i30);
                                    while (i28 < i12) {
                                        j10 = (j10 << 8) | ((long) (sVar2.f16611a[i28] & b10));
                                        i28++;
                                        b10 = 255;
                                    }
                                    if (i24 > 0) {
                                        j10 -= (1 << ((i29 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i29++;
                                    b10 = 255;
                                }
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int i31 = (int) j10;
                            int[] iArr3 = dVar.O;
                            if (i24 != 0) {
                                i31 += iArr3[i24 - 1];
                            }
                            iArr3[i24] = i31;
                            i25 += i31;
                            i24++;
                            i26 = i12;
                            b10 = 255;
                            i16 = 1;
                            i17 = 0;
                        }
                        throw m4.p0.a(null, "EBML lacing sample size out of range.");
                    }
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 4;
                    while (true) {
                        i13 = dVar.N - 1;
                        if (i32 >= i13) {
                            break;
                        }
                        dVar.O[i32] = 0;
                        while (true) {
                            i14 = i34 + 1;
                            dVar.l(oVar, i14);
                            int i35 = sVar2.f16611a[i34] & 255;
                            int[] iArr4 = dVar.O;
                            i15 = iArr4[i32] + i35;
                            iArr4[i32] = i15;
                            if (i35 != 255) {
                                break;
                            } else {
                                i34 = i14;
                            }
                        }
                        i33 += i15;
                        i32++;
                        i34 = i14;
                    }
                    dVar.O[i13] = ((i11 - dVar.Q) - i34) - i33;
                }
            }
            c3 = 1;
            c10 = 0;
            byte[] bArr6 = sVar2.f16611a;
            dVar.K = dVar.n((bArr6[c3] & 255) | (bArr6[c10] << 8)) + dVar.E;
            dVar.R = (cVar3.f10516e == 2 || (i10 == 163 && (sVar2.f16611a[2] & 128) == 128)) ? 1 : 0;
            dVar.J = 2;
            dVar.M = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i36 = dVar.M;
                if (i36 >= dVar.N) {
                    dVar.J = 0;
                    return;
                } else {
                    dVar.e(cVar3, ((long) ((dVar.M * cVar3.f10517f) / 1000)) + dVar.K, dVar.R, dVar.o(oVar, cVar3, dVar.O[i36], false), 0);
                    dVar.M++;
                }
            }
        } else {
            while (true) {
                int i37 = dVar.M;
                if (i37 >= dVar.N) {
                    return;
                }
                int[] iArr5 = dVar.O;
                iArr5[i37] = dVar.o(oVar, cVar3, iArr5[i37], true);
                dVar.M++;
            }
        }
    }

    @Override // q8.h
    public void n(q8.b bVar, Bitmap bitmap, Map map) {
        ((q8.i) this.f9258a).c(bVar, bitmap, map, ud.n.j(bitmap));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(n7.e0 r5, ac.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof n7.o
            if (r0 == 0) goto L13
            r0 = r6
            n7.o r0 = (n7.o) r0
            int r1 = r0.f15559f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15559f = r1
            goto L18
        L13:
            n7.o r0 = new n7.o
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f15557d
            int r1 = r0.f15559f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            ub.a.f(r6)
            ce.j0 r5 = new ce.j0
            r5.<init>()
            throw r5
        L32:
            ub.a.f(r6)
            java.lang.Object r6 = r4.f9258a
            lf.b1 r6 = (lf.b1) r6
            r0.f15559f = r2
            r6.b(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.p2.o(n7.e0, ac.c):void");
    }

    @Override // oe.e
    public oe.d p(be.b bVar) {
        oe.d dVarP;
        jc.l.e(bVar, "classId");
        for (yc.d0 d0Var : yc.v.i((yc.g0) this.f9258a, bVar.f2740a)) {
            if ((d0Var instanceof pe.c) && (dVarP = ((pe.c) d0Var).f17107i.p(bVar)) != null) {
                return dVarP;
            }
        }
        return null;
    }

    @Override // a8.d
    public String q() {
        return ((q7.e) this.f9258a).f17908b;
    }

    public androidx.media3.exoplayer.offline.a t() {
        k8.b bVarI;
        b5.d0 d0Var = (b5.d0) this.f9258a;
        k8.d dVar = (k8.d) d0Var.f1523d;
        synchronized (dVar) {
            d0Var.f(true);
            bVarI = dVar.i(((k8.a) d0Var.f1521b).f11191a);
        }
        if (bVarI != null) {
            return new androidx.media3.exoplayer.offline.a(bVarI, 1);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r7 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0114 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q8.c u(s8.i r18, q8.b r19, t8.h r20, t8.g r21) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.p2.u(s8.i, q8.b, t8.h, t8.g):q8.c");
    }

    @Override // n5.j
    public b7.q0 v(n5.l lVar, long j10, long j11, IOException iOException, int i10) {
        ((y4.d) this.f9258a).f25476b.x(iOException);
        return n5.o.f15370e;
    }

    public Object x(ac.i iVar) {
        Object objJ = j(this, r4.f13548a, iVar);
        return objJ == zb.a.f26667a ? objJ : ub.a0.f21526a;
    }

    public void y(Set set) {
        Object value;
        int[] iArr;
        jc.l.e(set, "tableIds");
        if (set.isEmpty()) {
            return;
        }
        lf.b1 b1Var = (lf.b1) this.f9258a;
        do {
            value = b1Var.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = set.contains(Integer.valueOf(i10)) ? iArr2[i10] + 1 : iArr2[i10];
            }
        } while (!b1Var.k(value, iArr));
    }

    public void z(int i10, long j10) throws m4.p0 {
        j6.d dVar = (j6.d) this.f9258a;
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw m4.p0.a(null, "ContentEncodingOrder " + j10 + " not supported");
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw m4.p0.a(null, "ContentEncodingScope " + j10 + " not supported");
        }
        switch (i10) {
            case 131:
                dVar.d(i10);
                dVar.f10572x.f10516e = (int) j10;
                return;
            case 136:
                dVar.d(i10);
                dVar.f10572x.X = j10 == 1;
                return;
            case TinkerReport.KEY_APPLIED_PACKAGE_CHECK_META_NOT_FOUND /* 155 */:
                dVar.L = dVar.n(j10);
                return;
            case 159:
                dVar.d(i10);
                dVar.f10572x.Q = (int) j10;
                return;
            case 176:
                dVar.d(i10);
                dVar.f10572x.f10525n = (int) j10;
                return;
            case 179:
                dVar.b(i10);
                dVar.F.a(dVar.n(j10));
                return;
            case 186:
                dVar.d(i10);
                dVar.f10572x.f10526o = (int) j10;
                return;
            case 215:
                dVar.d(i10);
                dVar.f10572x.f10515d = (int) j10;
                return;
            case 231:
                dVar.E = dVar.n(j10);
                return;
            case 238:
                dVar.S = (int) j10;
                return;
            case 241:
                if (dVar.H) {
                    return;
                }
                dVar.b(i10);
                dVar.G.a(j10);
                dVar.H = true;
                return;
            case TinkerReport.KEY_LOADED_UNCAUGHT_EXCEPTION /* 251 */:
                dVar.T = true;
                return;
            case 16871:
                dVar.d(i10);
                dVar.f10572x.f10519h = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw m4.p0.a(null, "ContentCompAlgo " + j10 + " not supported");
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw m4.p0.a(null, "DocTypeReadVersion " + j10 + " not supported");
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw m4.p0.a(null, "EBMLReadVersion " + j10 + " not supported");
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw m4.p0.a(null, "ContentEncAlgo " + j10 + " not supported");
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw m4.p0.a(null, "AESSettingsCipherMode " + j10 + " not supported");
            case 21420:
                dVar.A = j10 + dVar.f10567s;
                return;
            case 21432:
                int i11 = (int) j10;
                dVar.d(i10);
                if (i11 == 0) {
                    dVar.f10572x.f10536y = 0;
                    return;
                }
                if (i11 == 1) {
                    dVar.f10572x.f10536y = 2;
                    return;
                } else if (i11 == 3) {
                    dVar.f10572x.f10536y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    dVar.f10572x.f10536y = 3;
                    return;
                }
            case 21680:
                dVar.d(i10);
                dVar.f10572x.f10528q = (int) j10;
                return;
            case 21682:
                dVar.d(i10);
                dVar.f10572x.f10530s = (int) j10;
                return;
            case 21690:
                dVar.d(i10);
                dVar.f10572x.f10529r = (int) j10;
                return;
            case 21930:
                dVar.d(i10);
                dVar.f10572x.W = j10 == 1;
                return;
            case 21938:
                dVar.d(i10);
                j6.c cVar = dVar.f10572x;
                cVar.f10537z = true;
                cVar.f10527p = (int) j10;
                return;
            case 21998:
                dVar.d(i10);
                dVar.f10572x.f10518g = (int) j10;
                return;
            case 22186:
                dVar.d(i10);
                dVar.f10572x.T = j10;
                return;
            case 22203:
                dVar.d(i10);
                dVar.f10572x.U = j10;
                return;
            case 25188:
                dVar.d(i10);
                dVar.f10572x.R = (int) j10;
                return;
            case 30114:
                dVar.U = j10;
                return;
            case 30321:
                dVar.d(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    dVar.f10572x.f10531t = 0;
                    return;
                }
                if (i12 == 1) {
                    dVar.f10572x.f10531t = 1;
                    return;
                } else if (i12 == 2) {
                    dVar.f10572x.f10531t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    dVar.f10572x.f10531t = 3;
                    return;
                }
            case 2352003:
                dVar.d(i10);
                dVar.f10572x.f10517f = (int) j10;
                return;
            case 2807729:
                dVar.f10568t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        dVar.d(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            dVar.f10572x.C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            dVar.f10572x.C = 1;
                            return;
                        }
                    case 21946:
                        dVar.d(i10);
                        int iG = m4.h.g((int) j10);
                        if (iG != -1) {
                            dVar.f10572x.B = iG;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.d(i10);
                        dVar.f10572x.f10537z = true;
                        int iF = m4.h.f((int) j10);
                        if (iF != -1) {
                            dVar.f10572x.A = iF;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.d(i10);
                        dVar.f10572x.D = (int) j10;
                        return;
                    case 21949:
                        dVar.d(i10);
                        dVar.f10572x.E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public p2(f3.c cVar) {
        this.f9258a = new q.v0(q.x1.f17477a, cVar);
    }

    public p2(int[] iArr, float[] fArr, float[][] fArr2) {
        int i10;
        int length = fArr.length - 1;
        r.q[][] qVarArr = new r.q[length][];
        int i11 = 0;
        int i12 = 1;
        int i13 = 1;
        while (i11 < length) {
            int i14 = iArr[i11];
            if (i14 == 0) {
                i10 = 3;
            } else if (i14 == 1) {
                i12 = 1;
                i10 = 1;
            } else if (i14 == 2) {
                i12 = 2;
                i10 = 2;
            } else if (i14 != 3) {
                i10 = i14 != 4 ? i14 != 5 ? i13 : 5 : 4;
            } else {
                i12 = i12 == 1 ? 2 : 1;
                i10 = i12;
            }
            float[] fArr3 = fArr2[i11];
            int i15 = i11 + 1;
            float[] fArr4 = fArr2[i15];
            float f10 = fArr[i11];
            float f11 = fArr[i15];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            r.q[] qVarArr2 = new r.q[length2];
            int i16 = 0;
            while (i16 < length2) {
                int i17 = i16 * 2;
                r.q[] qVarArr3 = qVarArr2;
                int i18 = i16;
                int i19 = i17 + 1;
                qVarArr3[i18] = new r.q(i10, f10, f11, fArr3[i17], fArr3[i19], fArr4[i17], fArr4[i19]);
                i16 = i18 + 1;
                qVarArr2 = qVarArr3;
            }
            qVarArr[i11] = qVarArr2;
            i11 = i15;
            i13 = i10;
        }
        this.f9258a = qVarArr;
    }

    public p2(int i10, boolean z10) {
        switch (i10) {
            case 14:
                this.f9258a = new SparseIntArray();
                new SparseIntArray();
                break;
            case 21:
                this.f9258a = x0.v.v(Boolean.FALSE);
                break;
            case 24:
                this.f9258a = new Region();
                break;
            default:
                this.f9258a = new m3.l(17);
                break;
        }
    }

    @Override // l0.l
    public void h() {
    }

    @Override // q8.h
    public void b(int i10) {
    }

    @Override // n5.j
    public /* synthetic */ void r(n5.l lVar, long j10, long j11, int i10) {
    }

    @Override // n5.j
    public void s(n5.l lVar, long j10, long j11, boolean z10) {
    }
}
