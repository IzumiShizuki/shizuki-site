package n7;

import android.content.Context;
import android.content.Intent;
import i7.p2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import m0.l3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f15567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c4.g f15568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f15569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p7.b f15570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a8.a f15571g;

    public t(b bVar, c4.g gVar) {
        int i10;
        p7.e eVar;
        u uVar = bVar.f15402g;
        pe.d dVar = bVar.f15398c;
        String str = bVar.f15397b;
        this.f15567c = bVar;
        this.f15568d = gVar;
        List list = bVar.f15400e;
        this.f15569e = list == null ? vb.r.f22819a : list;
        z7.b bVar2 = bVar.f15415t;
        if (bVar2 != null) {
            if (str == null) {
                eVar = new p7.e(new m0.w(this, bVar2));
            } else {
                m0.w wVar = new m0.w(this, bVar2);
                int iOrdinal = uVar.ordinal();
                if (iOrdinal == 1) {
                    i10 = 1;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + uVar + '\'').toString());
                    }
                    i10 = 4;
                }
                int iOrdinal2 = uVar.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + uVar + '\'').toString());
                }
                eVar = new p7.e(wVar, str, i10);
            }
            this.f15570f = eVar;
        } else {
            if (dVar == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            b8.g gVar2 = new b8.g(bVar.f15396a, str, new b7.m(this, gVar.f3367a));
            jc.l.e(gVar2, "openHelper");
            p2 p2Var = new p2();
            p2Var.f9258a = gVar2;
            this.f15570f = new q7.b(p2Var);
        }
        boolean z10 = uVar == u.f15573b;
        a8.b bVarC = c();
        if (bVarC != null) {
            bVarC.setWriteAheadLoggingEnabled(z10);
        }
    }

    public static final void a(t tVar, z7.a aVar) throws Throwable {
        Object objB;
        c4.g gVar = tVar.f15568d;
        b bVar = tVar.f15567c;
        u uVar = bVar.f15402g;
        u uVar2 = u.f15573b;
        if (uVar == uVar2) {
            ud.n.g(aVar, "PRAGMA journal_mode = WAL");
        } else {
            ud.n.g(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (bVar.f15402g == uVar2) {
            ud.n.g(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            ud.n.g(aVar, "PRAGMA synchronous = FULL");
        }
        b(aVar);
        z7.c cVarD0 = aVar.d0("PRAGMA user_version");
        try {
            cVarD0.Z();
            int i10 = (int) cVarD0.getLong(0);
            gh.g.m(cVarD0, null);
            int i11 = gVar.f3367a;
            if (i10 != i11) {
                ud.n.g(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i10 == 0) {
                        tVar.d(aVar);
                    } else {
                        tVar.e(aVar, i10, i11);
                    }
                    ud.n.g(aVar, "PRAGMA user_version = " + i11);
                    objB = ub.a0.f21526a;
                } catch (Throwable th2) {
                    objB = ub.a.b(th2);
                }
                if (!(objB instanceof ub.m)) {
                    ud.n.g(aVar, "END TRANSACTION");
                }
                Throwable thA = ub.n.a(objB);
                if (thA != null) {
                    ud.n.g(aVar, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            tVar.f(aVar);
        } finally {
        }
    }

    public static void b(z7.a aVar) {
        z7.c cVarD0 = aVar.d0("PRAGMA busy_timeout");
        try {
            cVarD0.Z();
            long j10 = cVarD0.getLong(0);
            gh.g.m(cVarD0, null);
            if (j10 < 3000) {
                ud.n.g(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                gh.g.m(cVarD0, th2);
                throw th3;
            }
        }
    }

    public final a8.b c() {
        p2 p2Var;
        p7.b bVar = this.f15570f;
        q7.b bVar2 = bVar instanceof q7.b ? (q7.b) bVar : null;
        if (bVar2 == null || (p2Var = bVar2.f17893a) == null) {
            return null;
        }
        return (a8.b) p2Var.f9258a;
    }

    public final void d(z7.a aVar) {
        jc.l.e(aVar, "connection");
        z7.c cVarD0 = aVar.d0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (cVarD0.Z()) {
                if (cVarD0.getLong(0) == 0) {
                    z10 = true;
                }
            }
            gh.g.m(cVarD0, null);
            c4.g gVar = this.f15568d;
            gVar.a(aVar);
            if (!z10) {
                k5.d dVarG = gVar.g(aVar);
                if (!dVarG.f11043b) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) dVarG.f11044c)).toString());
                }
            }
            g(aVar);
            gVar.c(aVar);
            Iterator it = this.f15569e.iterator();
            while (it.hasNext()) {
                ((s) it.next()).getClass();
                if (aVar instanceof q7.a) {
                    jc.l.e(((q7.a) aVar).f17892a, "db");
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x009b A[EDGE_INSN: B:127:0x009b->B:38:0x009b BREAK  A[LOOP:4: B:9:0x0024->B:131:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(z7.a r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.t.e(z7.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(z7.a r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.t.f(z7.a):void");
    }

    public final void g(z7.a aVar) {
        ud.n.g(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = (String) this.f15568d.f3368b;
        jc.l.e(str, "hash");
        ud.n.g(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }

    public t(b bVar, l3 l3Var) {
        this.f15567c = bVar;
        this.f15568d = new r(-1, "", "");
        List list = bVar.f15400e;
        vb.r rVar = vb.r.f22819a;
        this.f15569e = list == null ? rVar : list;
        ArrayList arrayListR0 = vb.m.r0(list == null ? rVar : list, new s(new e7.y(12, this)));
        Context context = bVar.f15396a;
        String str = bVar.f15397b;
        pe.d dVar = bVar.f15398c;
        i4.d dVar2 = bVar.f15399d;
        boolean z10 = bVar.f15401f;
        u uVar = bVar.f15402g;
        Executor executor = bVar.f15403h;
        Executor executor2 = bVar.f15404i;
        Intent intent = bVar.f15405j;
        boolean z11 = bVar.f15406k;
        boolean z12 = bVar.f15407l;
        Set set = bVar.f15408m;
        String str2 = bVar.f15409n;
        File file = bVar.f15410o;
        Callable callable = bVar.f15411p;
        List list2 = bVar.f15412q;
        List list3 = bVar.f15413r;
        boolean z13 = bVar.f15414s;
        z7.b bVar2 = bVar.f15415t;
        yb.h hVar = bVar.f15416u;
        jc.l.e(dVar2, "migrationContainer");
        l3Var.a(new b(context, str, dVar, dVar2, arrayListR0, z10, uVar, executor, executor2, intent, z11, z12, set, str2, file, callable, list2, list3, z13, bVar2, hVar));
        throw null;
    }
}
