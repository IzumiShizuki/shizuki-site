package com.cnl.kikoeru.data.db;

import com.cnl.kikoeru.data.db.AppDatabase_Impl;
import d9.g;
import d9.j;
import d9.m;
import d9.o;
import d9.s;
import d9.v;
import d9.x;
import e9.b;
import e9.c;
import e9.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jc.a0;
import jc.z;
import kotlin.Metadata;
import n7.k;
import ub.a;
import ub.p;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/cnl/kikoeru/data/db/AppDatabase_Impl;", "Lcom/cnl/kikoeru/data/db/AppDatabase;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppDatabase_Impl extends AppDatabase {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f4314s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f4315t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p f4316u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p f4317v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p f4318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p f4319x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p f4320y;

    public AppDatabase_Impl() {
        final int i10 = 0;
        this.f4314s = a.d(new ic.a(this) { // from class: e9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f6422b;

            {
                this.f6422b = this;
            }

            @Override // ic.a
            public final Object b() {
                switch (i10) {
                    case 0:
                        return new x(this.f6422b);
                    case 1:
                        return new o(this.f6422b);
                    case 2:
                        return new m(this.f6422b);
                    case 3:
                        return new j(this.f6422b);
                    case 4:
                        return new v(this.f6422b);
                    case 5:
                        return new g(this.f6422b);
                    default:
                        return new s(this.f6422b);
                }
            }
        });
        final int i11 = 1;
        this.f4315t = a.d(new ic.a(this) { // from class: e9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f6422b;

            {
                this.f6422b = this;
            }

            @Override // ic.a
            public final Object b() {
                switch (i11) {
                    case 0:
                        return new x(this.f6422b);
                    case 1:
                        return new o(this.f6422b);
                    case 2:
                        return new m(this.f6422b);
                    case 3:
                        return new j(this.f6422b);
                    case 4:
                        return new v(this.f6422b);
                    case 5:
                        return new g(this.f6422b);
                    default:
                        return new s(this.f6422b);
                }
            }
        });
        final int i12 = 2;
        this.f4316u = a.d(new ic.a(this) { // from class: e9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f6422b;

            {
                this.f6422b = this;
            }

            @Override // ic.a
            public final Object b() {
                switch (i12) {
                    case 0:
                        return new x(this.f6422b);
                    case 1:
                        return new o(this.f6422b);
                    case 2:
                        return new m(this.f6422b);
                    case 3:
                        return new j(this.f6422b);
                    case 4:
                        return new v(this.f6422b);
                    case 5:
                        return new g(this.f6422b);
                    default:
                        return new s(this.f6422b);
                }
            }
        });
        final int i13 = 3;
        this.f4317v = a.d(new ic.a(this) { // from class: e9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f6422b;

            {
                this.f6422b = this;
            }

            @Override // ic.a
            public final Object b() {
                switch (i13) {
                    case 0:
                        return new x(this.f6422b);
                    case 1:
                        return new o(this.f6422b);
                    case 2:
                        return new m(this.f6422b);
                    case 3:
                        return new j(this.f6422b);
                    case 4:
                        return new v(this.f6422b);
                    case 5:
                        return new g(this.f6422b);
                    default:
                        return new s(this.f6422b);
                }
            }
        });
        final int i14 = 4;
        this.f4318w = a.d(new ic.a(this) { // from class: e9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f6422b;

            {
                this.f6422b = this;
            }

            @Override // ic.a
            public final Object b() {
                switch (i14) {
                    case 0:
                        return new x(this.f6422b);
                    case 1:
                        return new o(this.f6422b);
                    case 2:
                        return new m(this.f6422b);
                    case 3:
                        return new j(this.f6422b);
                    case 4:
                        return new v(this.f6422b);
                    case 5:
                        return new g(this.f6422b);
                    default:
                        return new s(this.f6422b);
                }
            }
        });
        final int i15 = 5;
        this.f4319x = a.d(new ic.a(this) { // from class: e9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f6422b;

            {
                this.f6422b = this;
            }

            @Override // ic.a
            public final Object b() {
                switch (i15) {
                    case 0:
                        return new x(this.f6422b);
                    case 1:
                        return new o(this.f6422b);
                    case 2:
                        return new m(this.f6422b);
                    case 3:
                        return new j(this.f6422b);
                    case 4:
                        return new v(this.f6422b);
                    case 5:
                        return new g(this.f6422b);
                    default:
                        return new s(this.f6422b);
                }
            }
        });
        final int i16 = 6;
        this.f4320y = a.d(new ic.a(this) { // from class: e9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f6422b;

            {
                this.f6422b = this;
            }

            @Override // ic.a
            public final Object b() {
                switch (i16) {
                    case 0:
                        return new x(this.f6422b);
                    case 1:
                        return new o(this.f6422b);
                    case 2:
                        return new m(this.f6422b);
                    case 3:
                        return new j(this.f6422b);
                    case 4:
                        return new v(this.f6422b);
                    case 5:
                        return new g(this.f6422b);
                    default:
                        return new s(this.f6422b);
                }
            }
        });
    }

    @Override // n7.v
    public final List b(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(2, 3, 1));
        arrayList.add(new c(1));
        arrayList.add(new b(4, 5, 2));
        arrayList.add(new c(2));
        arrayList.add(new b(6, 7, 3));
        arrayList.add(new c(3));
        arrayList.add(new c(4));
        arrayList.add(new c(5));
        arrayList.add(new b(10, 11, 0));
        arrayList.add(new c(0));
        return arrayList;
    }

    @Override // n7.v
    public final k c() {
        return new k(this, new LinkedHashMap(), new LinkedHashMap(), "HistoryBean", "DownloadBean", "SearchHistoryBean", "BlacklistBean", "ManualLRCBean", "AccountBean", "LyricBean");
    }

    @Override // n7.v
    public final c4.g d() {
        return new e(this);
    }

    @Override // n7.v
    public final Set h() {
        return new LinkedHashSet();
    }

    @Override // n7.v
    public final LinkedHashMap i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a0 a0Var = z.f10839a;
        pc.c cVarB = a0Var.b(x.class);
        r rVar = r.f22819a;
        linkedHashMap.put(cVarB, rVar);
        linkedHashMap.put(a0Var.b(o.class), rVar);
        linkedHashMap.put(a0Var.b(m.class), rVar);
        linkedHashMap.put(a0Var.b(j.class), rVar);
        linkedHashMap.put(a0Var.b(v.class), rVar);
        linkedHashMap.put(a0Var.b(g.class), rVar);
        linkedHashMap.put(a0Var.b(s.class), rVar);
        return linkedHashMap;
    }

    @Override // com.cnl.kikoeru.data.db.AppDatabase
    public final g o() {
        return (g) this.f4319x.getValue();
    }

    @Override // com.cnl.kikoeru.data.db.AppDatabase
    public final j p() {
        return (j) this.f4317v.getValue();
    }

    @Override // com.cnl.kikoeru.data.db.AppDatabase
    public final m q() {
        return (m) this.f4316u.getValue();
    }

    @Override // com.cnl.kikoeru.data.db.AppDatabase
    public final o v() {
        return (o) this.f4315t.getValue();
    }

    @Override // com.cnl.kikoeru.data.db.AppDatabase
    public final s w() {
        return (s) this.f4320y.getValue();
    }

    @Override // com.cnl.kikoeru.data.db.AppDatabase
    public final v x() {
        return (v) this.f4318w.getValue();
    }

    @Override // com.cnl.kikoeru.data.db.AppDatabase
    public final x y() {
        return (x) this.f4314s.getValue();
    }
}
