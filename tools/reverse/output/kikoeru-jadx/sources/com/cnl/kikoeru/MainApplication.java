package com.cnl.kikoeru;

import a9.i;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import b0.c1;
import c4.g;
import com.cnl.kikoeru.data.db.AppDatabase;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.mmkv.MMKV;
import ef.n;
import fg.b;
import h1.z;
import hd.q0;
import hf.a0;
import hf.l0;
import hf.y;
import ig.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import jc.l;
import kotlin.Metadata;
import m0.l3;
import n7.k;
import n7.m0;
import n7.u;
import pc.f0;
import pf.d;
import pf.e;
import q.t0;
import ub.j;
import ug.f;
import ug.p;
import ug.s;
import ug.t;
import ug.v;
import ug.w;
import ug.x;
import vb.m;
import x0.e1;
import xf.c;
import yb.h;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/cnl/kikoeru/MainApplication;", "Landroid/app/Application;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainApplication extends Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static MainApplication f4295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static x f4296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static AppDatabase f4297c;

    @Override // android.app.Application
    public final void onCreate() {
        String name;
        g gVarD;
        boolean zContainsKey;
        super.onCreate();
        f4295a = this;
        c1 c1Var = new c1(this);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        a aVar = new a(1);
        arrayList.add(b.f7085b);
        xf.b bVar = c.f24987d;
        l.e(bVar, "json");
        c1 c1Var2 = new c1(bVar);
        wb.b bVarL = ud.b.l();
        bVarL.add(aVar);
        int i10 = 0;
        bVarL.add(new ig.b(i10));
        bVarL.add(new a(0));
        m.P(bVarL, arrayList);
        bVarL.add(new a(c1Var));
        wb.b bVarG = ud.b.g(bVarL);
        ig.b bVar2 = new ig.b(1);
        ListIterator listIterator = bVarG.listIterator(0);
        gg.a aVar2 = bVar2;
        while (true) {
            z zVar = (z) listIterator;
            if (!zVar.hasNext()) {
                break;
            }
            gg.a aVar3 = (gg.a) zVar.next();
            aVar2.f7542a = aVar3;
            aVar2 = aVar3;
        }
        gg.c.f7545a.put("DEFAULT", new hg.a(bVar2, c1Var, linkedHashMap, c1Var2));
        MMKV.r();
        File file = new File(getCacheDir(), "kikoeru_api");
        na.c.d(file);
        boolean zBooleanValue = ((Boolean) a0.c.F(Boolean.TYPE, gg.c.a(), "doh", Boolean.FALSE)).booleanValue();
        String str = (String) f0.P(gg.c.a(), "dohUrl", "https://dns.alidns.com/dns-query", jc.z.a(String.class)).a();
        w wVar = new w();
        wVar.f21892l = new f(file);
        yb.c cVar = null;
        if (zBooleanValue) {
            x xVar = new x();
            l.e(str, "<this>");
            s sVar = new s();
            sVar.d(null, str);
            t tVarB = sVar.b();
            w wVar2 = new w();
            wVar2.f21881a = xVar.f21907a;
            wVar2.f21882b = xVar.D;
            m.P(wVar2.f21883c, xVar.f21908b);
            m.P(wVar2.f21884d, xVar.f21909c);
            wVar2.f21885e = xVar.f21910d;
            wVar2.f21886f = xVar.f21911e;
            wVar2.f21887g = xVar.f21912f;
            wVar2.f21888h = xVar.f21913g;
            wVar2.f21889i = xVar.f21914h;
            wVar2.f21890j = xVar.f21915i;
            wVar2.f21891k = xVar.f21916j;
            wVar2.f21892l = xVar.f21917k;
            wVar2.f21893m = xVar.f21918l;
            wVar2.f21894n = xVar.f21919m;
            wVar2.f21895o = xVar.f21920n;
            wVar2.f21896p = xVar.f21921o;
            wVar2.f21897q = xVar.f21922p;
            wVar2.f21898r = xVar.f21923q;
            wVar2.f21899s = xVar.f21924r;
            wVar2.f21900t = xVar.f21925s;
            wVar2.f21901u = xVar.f21926t;
            wVar2.f21902v = xVar.f21927u;
            wVar2.f21903w = xVar.f21928v;
            wVar2.f21904x = xVar.f21929w;
            wVar2.f21905y = xVar.f21930x;
            wVar2.f21906z = xVar.f21931y;
            wVar2.A = xVar.f21932z;
            wVar2.B = xVar.A;
            wVar2.C = xVar.B;
            wVar2.D = xVar.C;
            v vVar = vg.a.f22963e;
            p pVar = wVar2.f21893m;
            ug.b bVar3 = p.f21854a;
            if (!bVar3.equals(pVar)) {
                wVar2.C = null;
            }
            wVar2.f21893m = bVar3;
            vg.a aVar4 = new vg.a(new x(wVar2), tVarB);
            if (!aVar4.equals(wVar.f21893m)) {
                wVar.C = null;
            }
            wVar.f21893m = aVar4;
        }
        wVar.f21884d.add(new a9.l());
        f4296b = new x(wVar);
        String str2 = ag.z.f369a;
        x xVar2 = f4296b;
        if (xVar2 == null) {
            l.k("DEFAULT_OKHTTP_CLIENT");
            throw null;
        }
        ag.z.f370b = xVar2;
        String str3 = (String) g9.a.a().getValue();
        l.e(str3, "<set-?>");
        ag.z.f369a = str3;
        Logger.getLogger(x.class.getName()).setLevel(Level.OFF);
        na.v.f15761a.getClass();
        y yVar = (y) i.f240k.getValue();
        e eVar = l0.f8566a;
        a0.y(yVar, d.f17138c, null, new cg.t(false, null), 2);
        Context applicationContext = getApplicationContext();
        l.d(applicationContext, "getApplicationContext(...)");
        if (n.y0("kikoeru")) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        i4.d dVar = new i4.d(1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList4 = new ArrayList();
        pc.c cVarH = g8.a.H(AppDatabase.class);
        if (!linkedHashSet2.isEmpty()) {
            Iterator it = linkedHashSet2.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(t0.B(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ").toString());
                }
            }
        }
        pe.d dVar2 = new pe.d(14);
        Object systemService = applicationContext.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        u uVar = (activityManager == null || activityManager.isLowRamDevice()) ? u.f15572a : u.f15573b;
        k7.b bVar4 = m.a.f12628d;
        n7.b bVar5 = new n7.b(applicationContext, "kikoeru", dVar2, dVar, arrayList2, false, uVar, bVar4, bVar4, null, true, true, linkedHashSet, null, null, null, arrayList3, arrayList4, false, null, null);
        Class clsD = g8.a.D(cVarH);
        Package r32 = clsD.getPackage();
        if (r32 == null || (name = r32.getName()) == null) {
            name = "";
        }
        String canonicalName = clsD.getCanonicalName();
        l.b(canonicalName);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            l.d(canonicalName, "substring(...)");
        }
        String strConcat = ef.u.i0(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsD.getClassLoader());
            l.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            n7.v vVar2 = (n7.v) cls.getDeclaredConstructor(null).newInstance(null);
            vVar2.getClass();
            vVar2.f15585k = true;
            try {
                gVarD = vVar2.d();
                l.c(gVarD, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            } catch (j unused) {
                gVarD = null;
            }
            if (gVarD == null) {
                new n7.t(bVar5, new l3(vVar2));
                throw null;
            }
            vVar2.f15579e = new n7.t(bVar5, gVarD);
            vVar2.f15580f = vVar2.c();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Set setH = vVar2.h();
            List list = bVar5.f15413r;
            int size = list.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setH.iterator();
            while (true) {
                int i11 = -1;
                if (!it2.hasNext()) {
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i12 = size2 - 1;
                            if (size2 >= size || !zArr[size2]) {
                                break;
                            } else if (i12 < 0) {
                                break;
                            } else {
                                size2 = i12;
                            }
                        }
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                    for (r7.a aVar5 : vVar2.b(linkedHashMap2)) {
                        int i13 = aVar5.f18913a;
                        int i14 = aVar5.f18914b;
                        i4.d dVar3 = bVar5.f15399d;
                        LinkedHashMap linkedHashMap3 = dVar3.f9004a;
                        if (linkedHashMap3.containsKey(Integer.valueOf(i13))) {
                            Map map = (Map) linkedHashMap3.get(Integer.valueOf(i13));
                            if (map == null) {
                                map = vb.s.f22820a;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(i14));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            int i15 = aVar5.f18913a;
                            LinkedHashMap linkedHashMap4 = dVar3.f9004a;
                            Integer numValueOf = Integer.valueOf(i15);
                            Object treeMap = linkedHashMap4.get(numValueOf);
                            if (treeMap == null) {
                                treeMap = new TreeMap();
                                linkedHashMap4.put(numValueOf, treeMap);
                            }
                            TreeMap treeMap2 = (TreeMap) treeMap;
                            if (treeMap2.containsKey(Integer.valueOf(i14))) {
                                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i14)) + " with " + aVar5);
                            }
                            treeMap2.put(Integer.valueOf(i14), aVar5);
                        }
                    }
                    LinkedHashMap linkedHashMapI = vVar2.i();
                    List list2 = bVar5.f15412q;
                    boolean[] zArr2 = new boolean[list2.size()];
                    for (Map.Entry entry : linkedHashMapI.entrySet()) {
                        pc.c cVar2 = (pc.c) entry.getKey();
                        for (pc.c cVar3 : (List) entry.getValue()) {
                            int size3 = list2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i16 = size3 - 1;
                                    if (cVar3.z(list2.get(size3))) {
                                        zArr2[size3] = true;
                                        break;
                                    } else if (i16 < 0) {
                                        break;
                                    } else {
                                        size3 = i16;
                                    }
                                }
                                size3 = -1;
                            } else {
                                size3 = -1;
                            }
                            if (size3 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + cVar3.x() + ") for " + cVar2.x() + " is missing in the database configuration.").toString());
                            }
                            Object obj = list2.get(size3);
                            l.e(cVar3, "kclass");
                            l.e(obj, "converter");
                            vVar2.f15584j.put(cVar3, obj);
                        }
                    }
                    int size4 = list2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i17 = size4 - 1;
                            if (!zArr2[size4]) {
                                throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i17 < 0) {
                                break;
                            } else {
                                size4 = i17;
                            }
                        }
                    }
                    vVar2.f15577c = bVar5.f15403h;
                    vVar2.f15578d = new n7.y(bVar5.f15404i);
                    Executor executor = vVar2.f15577c;
                    if (executor == null) {
                        l.k("internalQueryExecutor");
                        throw null;
                    }
                    nf.d dVarB = a0.b(ud.b.C(a0.o(executor), a0.e()));
                    vVar2.f15575a = dVarB;
                    h hVar = dVarB.f15823a;
                    n7.y yVar2 = vVar2.f15578d;
                    if (yVar2 == null) {
                        l.k("internalTransactionExecutor");
                        throw null;
                    }
                    vVar2.f15576b = hVar.G(a0.o(yVar2));
                    vVar2.f15582h = bVar5.f15401f;
                    n7.t tVar = vVar2.f15579e;
                    if (tVar == null) {
                        l.k("connectionManager");
                        throw null;
                    }
                    a8.b bVarC = tVar.c();
                    if (bVarC == null) {
                        bVarC = null;
                        break;
                    }
                    while (!(bVarC instanceof u7.b)) {
                        if (!(bVarC instanceof n7.c)) {
                            bVarC = null;
                            break;
                        }
                        bVarC = ((n7.c) bVarC).b();
                    }
                    n7.t tVar2 = vVar2.f15579e;
                    if (tVar2 == null) {
                        l.k("connectionManager");
                        throw null;
                    }
                    a8.b bVarC2 = tVar2.c();
                    if (bVarC2 == null) {
                        bVarC2 = null;
                        break;
                    }
                    while (!(bVarC2 instanceof u7.a)) {
                        if (!(bVarC2 instanceof n7.c)) {
                            bVarC2 = null;
                            break;
                        }
                        bVarC2 = ((n7.c) bVarC2).b();
                    }
                    f4297c = (AppDatabase) vVar2;
                    e1 e1Var = ba.y.f2506a;
                    k kVarF = i.c().f();
                    q0 q0Var = new q0(2);
                    q0Var.f("BlacklistBean");
                    q0Var.i(new String[0]);
                    ArrayList arrayList5 = q0Var.f8447b;
                    ba.x xVar3 = new ba.x((String[]) arrayList5.toArray(new String[arrayList5.size()]), 0);
                    LinkedHashMap linkedHashMap5 = kVarF.f15520c;
                    m0 m0Var = kVarF.f15519b;
                    ub.k kVarH = m0Var.h(xVar3.f2503a);
                    String[] strArr = (String[]) kVarH.f21543a;
                    int[] iArr = (int[]) kVarH.f21544b;
                    n7.p pVar2 = new n7.p(xVar3, iArr, strArr);
                    ReentrantLock reentrantLock = kVarF.f15521d;
                    reentrantLock.lock();
                    try {
                        n7.p pVar3 = linkedHashMap5.containsKey(xVar3) ? (n7.p) vb.w.r(xVar3, linkedHashMap5) : (n7.p) linkedHashMap5.put(xVar3, pVar2);
                        reentrantLock.unlock();
                        if (pVar3 == null && m0Var.f15549h.q(iArr)) {
                            nd.h.t(new n7.j(kVarF, cVar, i10));
                        }
                        registerReceiver(h9.e.f8247a, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                        CrashReport.initCrashReport(getApplicationContext(), "d4c0581032", false);
                        return;
                    } catch (Throwable th2) {
                        reentrantLock.unlock();
                        throw th2;
                    }
                }
                pc.c cVar4 = (pc.c) it2.next();
                int size5 = list.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i18 = size5 - 1;
                        if (cVar4.z(list.get(size5))) {
                            zArr[size5] = true;
                            i11 = size5;
                            break;
                        } else if (i18 < 0) {
                            break;
                        } else {
                            size5 = i18;
                        }
                    }
                }
                if (i11 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cVar4.x() + ") is missing in the database configuration.").toString());
                }
                linkedHashMap2.put(cVar4, list.get(i11));
            }
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Cannot find implementation for " + clsD.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Cannot access the constructor " + clsD.getCanonicalName(), e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("Failed to create an instance of " + clsD.getCanonicalName(), e12);
        }
    }
}
