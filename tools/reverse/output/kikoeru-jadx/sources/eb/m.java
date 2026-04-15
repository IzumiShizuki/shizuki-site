package eb;

import hb.a1;
import hb.q0;
import hb.r0;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f6457h = i.f6449d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f6458i = h.f6447a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u f6459j = y.f6472a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v f6460k = y.f6473b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f6461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f6462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g5.w f6463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hb.i f6464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f6465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f6467g;

    public m() {
        gb.g gVar = gb.g.f7476c;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.f6461a = new ThreadLocal();
        this.f6462b = new ConcurrentHashMap();
        g5.w wVar = new g5.w(11);
        this.f6463c = wVar;
        this.f6466f = true;
        this.f6467g = f6457h;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a1.A);
        u uVar = y.f6472a;
        u uVar2 = f6459j;
        arrayList.add(uVar2 == uVar ? hb.m.f8325c : new hb.k(1, uVar2));
        arrayList.add(gVar);
        arrayList.addAll(list);
        arrayList.add(a1.f8291p);
        arrayList.add(a1.f8282g);
        arrayList.add(a1.f8279d);
        arrayList.add(a1.f8280e);
        arrayList.add(a1.f8281f);
        hb.v vVar = a1.f8286k;
        arrayList.add(new r0(Long.TYPE, Long.class, vVar));
        arrayList.add(new r0(Double.TYPE, Double.class, new j(0)));
        arrayList.add(new r0(Float.TYPE, Float.class, new j(1)));
        v vVar2 = y.f6473b;
        v vVar3 = f6460k;
        arrayList.add(vVar3 == vVar2 ? hb.l.f8323b : new hb.k(0, new hb.l(vVar3)));
        arrayList.add(a1.f8283h);
        arrayList.add(a1.f8284i);
        arrayList.add(new q0(AtomicLong.class, new k(new k(vVar, 0), 2), 0));
        int i10 = 0;
        arrayList.add(new q0(AtomicLongArray.class, new k(new k(vVar, 1), 2), i10));
        arrayList.add(a1.f8285j);
        arrayList.add(a1.f8287l);
        arrayList.add(a1.f8292q);
        arrayList.add(a1.f8293r);
        arrayList.add(new q0(BigDecimal.class, a1.f8288m, i10));
        arrayList.add(new q0(BigInteger.class, a1.f8289n, i10));
        arrayList.add(new q0(gb.i.class, a1.f8290o, i10));
        arrayList.add(a1.f8294s);
        arrayList.add(a1.f8295t);
        arrayList.add(a1.f8297v);
        arrayList.add(a1.f8298w);
        arrayList.add(a1.f8300y);
        arrayList.add(a1.f8296u);
        arrayList.add(a1.f8277b);
        arrayList.add(hb.g.f8311c);
        arrayList.add(a1.f8299x);
        if (kb.e.f11322a) {
            arrayList.add(kb.e.f11324c);
            arrayList.add(kb.e.f11323b);
            arrayList.add(kb.e.f11325d);
        }
        arrayList.add(hb.b.f8302c);
        arrayList.add(a1.f8276a);
        arrayList.add(new hb.d(wVar, 0));
        arrayList.add(new hb.d(wVar, 1));
        hb.i iVar = new hb.i(wVar);
        this.f6464d = iVar;
        arrayList.add(iVar);
        arrayList.add(a1.B);
        arrayList.add(new hb.s(wVar, f6458i, gVar, iVar));
        this.f6465e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARN: Finally extract failed */
    public final Object b(String str, Class cls) {
        lb.a aVar = new lb.a(cls);
        Object objA = null;
        if (str != null) {
            mb.a aVar2 = new mb.a(new StringReader(str));
            aVar2.f15080o = 2;
            boolean z10 = true;
            aVar2.f15080o = 1;
            try {
                try {
                    try {
                        aVar2.h0();
                        z10 = false;
                        objA = c(aVar).a(aVar2);
                    } catch (EOFException e10) {
                        if (!z10) {
                            throw new t(e10);
                        }
                    } catch (IllegalStateException e11) {
                        throw new t(e11);
                    }
                    aVar2.f15080o = 2;
                    if (objA != null) {
                        try {
                            if (aVar2.h0() != 10) {
                                throw new t("JSON document was not fully consumed.");
                            }
                        } catch (mb.c e12) {
                            throw new t(e12);
                        } catch (IOException e13) {
                            throw new p(e13);
                        }
                    }
                } catch (IOException e14) {
                    throw new t(e14);
                } catch (AssertionError e15) {
                    throw new AssertionError("AssertionError (GSON 2.11.0): " + e15.getMessage(), e15);
                }
            } catch (Throwable th2) {
                aVar2.f15080o = 2;
                throw th2;
            }
        }
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(objA);
    }

    public final z c(lb.a aVar) {
        boolean z10;
        ConcurrentHashMap concurrentHashMap = this.f6462b;
        z zVar = (z) concurrentHashMap.get(aVar);
        if (zVar != null) {
            return zVar;
        }
        ThreadLocal threadLocal = this.f6461a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z10 = true;
        } else {
            z zVar2 = (z) map.get(aVar);
            if (zVar2 != null) {
                return zVar2;
            }
            z10 = false;
        }
        try {
            l lVar = new l();
            map.put(aVar, lVar);
            Iterator it = this.f6465e.iterator();
            z zVarA = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zVarA = ((a0) it.next()).a(this, aVar);
                if (zVarA != null) {
                    if (lVar.f6456a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    lVar.f6456a = zVarA;
                    map.put(aVar, zVarA);
                }
            }
            if (z10) {
                threadLocal.remove();
            }
            if (zVarA != null) {
                if (z10) {
                    concurrentHashMap.putAll(map);
                }
                return zVarA;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + aVar);
        } catch (Throwable th2) {
            if (z10) {
                threadLocal.remove();
            }
            throw th2;
        }
    }

    public final String d(Object obj) {
        Class<?> cls = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            mb.b bVar = new mb.b(stringWriter);
            bVar.D(this.f6467g);
            bVar.f15092i = this.f6466f;
            bVar.G(2);
            bVar.f15094k = false;
            e(obj, cls, bVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new p(e10);
        }
    }

    public final void e(Object obj, Class cls, mb.b bVar) {
        z zVarC = c(new lb.a(cls));
        int i10 = bVar.f15091h;
        if (i10 == 2) {
            bVar.f15091h = 1;
        }
        boolean z10 = bVar.f15092i;
        boolean z11 = bVar.f15094k;
        bVar.f15092i = this.f6466f;
        bVar.f15094k = false;
        try {
            try {
                zVarC.b(bVar, obj);
            } catch (IOException e10) {
                throw new p(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e11.getMessage(), e11);
            }
        } finally {
            bVar.G(i10);
            bVar.f15092i = z10;
            bVar.f15094k = z11;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f6465e + ",instanceCreators:" + this.f6463c + "}";
    }
}
