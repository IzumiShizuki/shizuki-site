package uf;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f21671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f21672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f21673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f21674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f21675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f21676g;

    public a(String str) {
        jc.l.e(str, "serialName");
        this.f21670a = str;
        this.f21671b = r.f22819a;
        this.f21672c = new ArrayList();
        this.f21673d = new HashSet();
        this.f21674e = new ArrayList();
        this.f21675f = new ArrayList();
        this.f21676g = new ArrayList();
    }

    public static void a(a aVar, String str, g gVar) {
        aVar.getClass();
        jc.l.e(str, "elementName");
        jc.l.e(gVar, "descriptor");
        if (!aVar.f21673d.add(str)) {
            StringBuilder sbK = a0.c.K("Element with name '", str, "' is already registered in ");
            sbK.append(aVar.f21670a);
            throw new IllegalArgumentException(sbK.toString().toString());
        }
        aVar.f21672c.add(str);
        aVar.f21674e.add(gVar);
        aVar.f21675f.add(r.f22819a);
        aVar.f21676g.add(false);
    }
}
