package com.cnl.kikoeru.data.db;

import com.cnl.kikoeru.data.db.AppDatabase;
import d9.g;
import d9.j;
import d9.m;
import d9.o;
import d9.s;
import d9.x;
import kotlin.Metadata;
import n7.v;
import ub.a;
import ub.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/cnl/kikoeru/data/db/AppDatabase;", "Ln7/v;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AppDatabase extends v {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f4307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p f4308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p f4309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p f4310o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f4311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f4312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p f4313r;

    public AppDatabase() {
        final int i10 = 0;
        this.f4307l = a.d(new ic.a(this) { // from class: e9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase f6417b;

            {
                this.f6417b = this;
            }

            @Override // ic.a
            public final Object b() {
                switch (i10) {
                    case 0:
                        return this.f6417b.y();
                    case 1:
                        return this.f6417b.v();
                    case 2:
                        return this.f6417b.q();
                    case 3:
                        return this.f6417b.p();
                    case 4:
                        return this.f6417b.x();
                    case 5:
                        return this.f6417b.o();
                    default:
                        return this.f6417b.w();
                }
            }
        });
        final int i11 = 1;
        this.f4308m = a.d(new ic.a(this) { // from class: e9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase f6417b;

            {
                this.f6417b = this;
            }

            @Override // ic.a
            public final Object b() {
                switch (i11) {
                    case 0:
                        return this.f6417b.y();
                    case 1:
                        return this.f6417b.v();
                    case 2:
                        return this.f6417b.q();
                    case 3:
                        return this.f6417b.p();
                    case 4:
                        return this.f6417b.x();
                    case 5:
                        return this.f6417b.o();
                    default:
                        return this.f6417b.w();
                }
            }
        });
        final int i12 = 2;
        this.f4309n = a.d(new ic.a(this) { // from class: e9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase f6417b;

            {
                this.f6417b = this;
            }

            @Override // ic.a
            public final Object b() {
                switch (i12) {
                    case 0:
                        return this.f6417b.y();
                    case 1:
                        return this.f6417b.v();
                    case 2:
                        return this.f6417b.q();
                    case 3:
                        return this.f6417b.p();
                    case 4:
                        return this.f6417b.x();
                    case 5:
                        return this.f6417b.o();
                    default:
                        return this.f6417b.w();
                }
            }
        });
        final int i13 = 3;
        this.f4310o = a.d(new ic.a(this) { // from class: e9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase f6417b;

            {
                this.f6417b = this;
            }

            @Override // ic.a
            public final Object b() {
                switch (i13) {
                    case 0:
                        return this.f6417b.y();
                    case 1:
                        return this.f6417b.v();
                    case 2:
                        return this.f6417b.q();
                    case 3:
                        return this.f6417b.p();
                    case 4:
                        return this.f6417b.x();
                    case 5:
                        return this.f6417b.o();
                    default:
                        return this.f6417b.w();
                }
            }
        });
        final int i14 = 4;
        this.f4311p = a.d(new ic.a(this) { // from class: e9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase f6417b;

            {
                this.f6417b = this;
            }

            @Override // ic.a
            public final Object b() {
                switch (i14) {
                    case 0:
                        return this.f6417b.y();
                    case 1:
                        return this.f6417b.v();
                    case 2:
                        return this.f6417b.q();
                    case 3:
                        return this.f6417b.p();
                    case 4:
                        return this.f6417b.x();
                    case 5:
                        return this.f6417b.o();
                    default:
                        return this.f6417b.w();
                }
            }
        });
        final int i15 = 5;
        this.f4312q = a.d(new ic.a(this) { // from class: e9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase f6417b;

            {
                this.f6417b = this;
            }

            @Override // ic.a
            public final Object b() {
                switch (i15) {
                    case 0:
                        return this.f6417b.y();
                    case 1:
                        return this.f6417b.v();
                    case 2:
                        return this.f6417b.q();
                    case 3:
                        return this.f6417b.p();
                    case 4:
                        return this.f6417b.x();
                    case 5:
                        return this.f6417b.o();
                    default:
                        return this.f6417b.w();
                }
            }
        });
        final int i16 = 6;
        this.f4313r = a.d(new ic.a(this) { // from class: e9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase f6417b;

            {
                this.f6417b = this;
            }

            @Override // ic.a
            public final Object b() {
                switch (i16) {
                    case 0:
                        return this.f6417b.y();
                    case 1:
                        return this.f6417b.v();
                    case 2:
                        return this.f6417b.q();
                    case 3:
                        return this.f6417b.p();
                    case 4:
                        return this.f6417b.x();
                    case 5:
                        return this.f6417b.o();
                    default:
                        return this.f6417b.w();
                }
            }
        });
    }

    public abstract g o();

    public abstract j p();

    public abstract m q();

    public final j r() {
        return (j) this.f4310o.getValue();
    }

    public final m s() {
        return (m) this.f4309n.getValue();
    }

    public final o t() {
        return (o) this.f4308m.getValue();
    }

    public final s u() {
        return (s) this.f4313r.getValue();
    }

    public abstract o v();

    public abstract s w();

    public abstract d9.v x();

    public abstract x y();
}
