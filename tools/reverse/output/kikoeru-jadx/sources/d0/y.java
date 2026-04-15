package d0;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import b0.u0;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q.t0;
import x0.a1;
import x0.b1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f5435f;

    public y(Map map, Map map2, Map map3, Map map4, Map map5, boolean z10) {
        jc.l.e(map, "class2ContextualFactory");
        jc.l.e(map2, "polyBase2Serializers");
        jc.l.e(map3, "polyBase2DefaultSerializerProvider");
        jc.l.e(map4, "polyBase2NamedSerializers");
        jc.l.e(map5, "polyBase2DefaultDeserializerProvider");
        this.f5431b = map;
        this.f5432c = map2;
        this.f5433d = map3;
        this.f5434e = map4;
        this.f5435f = map5;
        this.f5430a = z10;
    }

    public sf.a a(pc.c cVar, List list) {
        return null;
    }

    public xa.i b(int i10) {
        xa.i iVar;
        xa.i oVar;
        HashMap map = (HashMap) this.f5432c;
        xa.i iVar2 = (xa.i) map.get(Integer.valueOf(i10));
        if (iVar2 != null) {
            return iVar2;
        }
        final s4.g gVar = (s4.g) this.f5434e;
        gVar.getClass();
        final int i11 = 0;
        if (i10 != 0) {
            final int i12 = 1;
            if (i10 != 1) {
                final int i13 = 2;
                if (i10 != 2) {
                    final int i14 = 3;
                    if (i10 == 3) {
                        oVar = new j5.o(i11, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(j5.c0.class));
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException(t0.B(i10, "Unrecognized contentType: "));
                        }
                        iVar = new xa.i() { // from class: j5.n
                            @Override // xa.i
                            public final Object get() {
                                switch (i14) {
                                    case 0:
                                        return q.e((Class) this, gVar);
                                    case 1:
                                        return q.e((Class) this, gVar);
                                    case 2:
                                        return q.e((Class) this, gVar);
                                    default:
                                        return new v0(gVar, (r5.l) ((d0.y) this).f5431b);
                                }
                            }
                        };
                    }
                } else {
                    final Class clsAsSubclass = HlsMediaSource$Factory.class.asSubclass(j5.c0.class);
                    oVar = new xa.i() { // from class: j5.n
                        @Override // xa.i
                        public final Object get() {
                            switch (i13) {
                                case 0:
                                    return q.e((Class) clsAsSubclass, gVar);
                                case 1:
                                    return q.e((Class) clsAsSubclass, gVar);
                                case 2:
                                    return q.e((Class) clsAsSubclass, gVar);
                                default:
                                    return new v0(gVar, (r5.l) ((d0.y) clsAsSubclass).f5431b);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(j5.c0.class);
                oVar = new xa.i() { // from class: j5.n
                    @Override // xa.i
                    public final Object get() {
                        switch (i12) {
                            case 0:
                                return q.e((Class) genericDeclarationAsSubclass, gVar);
                            case 1:
                                return q.e((Class) genericDeclarationAsSubclass, gVar);
                            case 2:
                                return q.e((Class) genericDeclarationAsSubclass, gVar);
                            default:
                                return new v0(gVar, (r5.l) ((d0.y) genericDeclarationAsSubclass).f5431b);
                        }
                    }
                };
            }
            iVar = oVar;
        } else {
            final Class clsAsSubclass2 = DashMediaSource$Factory.class.asSubclass(j5.c0.class);
            iVar = new xa.i() { // from class: j5.n
                @Override // xa.i
                public final Object get() {
                    switch (i11) {
                        case 0:
                            return q.e((Class) clsAsSubclass2, gVar);
                        case 1:
                            return q.e((Class) clsAsSubclass2, gVar);
                        case 2:
                            return q.e((Class) clsAsSubclass2, gVar);
                        default:
                            return new v0(gVar, (r5.l) ((d0.y) clsAsSubclass2).f5431b);
                    }
                }
            };
        }
        map.put(Integer.valueOf(i10), iVar);
        return iVar;
    }

    public y(int i10, float f10, f0 f0Var) {
        this.f5431b = f0Var;
        this.f5432c = new b1(i10);
        this.f5433d = new a1(f10);
        this.f5435f = new u0(i10, 30, 100);
    }

    public y(r5.l lVar, m3.l lVar2) {
        this.f5431b = lVar;
        this.f5435f = lVar2;
        this.f5432c = new HashMap();
        this.f5433d = new HashMap();
        this.f5430a = true;
    }
}
