package i9;

import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends CopyOnWriteArraySet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9472a = new LinkedHashMap();

    @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        androidx.media3.exoplayer.offline.k kVar = (androidx.media3.exoplayer.offline.k) obj;
        jc.l.e(kVar, "element");
        if (!kVar.getClass().equals(Class.forName("androidx.media3.exoplayer.offline.DownloadService$DownloadManagerHelper"))) {
            return super.add(kVar);
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(kVar.getClass().getClassLoader(), new Class[]{androidx.media3.exoplayer.offline.k.class}, new c(kVar));
        jc.l.c(objNewProxyInstance, "null cannot be cast to non-null type androidx.media3.exoplayer.offline.DownloadManager.Listener");
        androidx.media3.exoplayer.offline.k kVar2 = (androidx.media3.exoplayer.offline.k) objNewProxyInstance;
        this.f9472a.put(kVar, kVar2);
        return super.add(kVar2);
    }

    @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof androidx.media3.exoplayer.offline.k) {
            return super.contains((androidx.media3.exoplayer.offline.k) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj == null ? true : obj instanceof androidx.media3.exoplayer.offline.k)) {
            return false;
        }
        androidx.media3.exoplayer.offline.k kVar = (androidx.media3.exoplayer.offline.k) obj;
        if (kVar != null) {
            LinkedHashMap linkedHashMap = this.f9472a;
            if (linkedHashMap.containsKey(kVar)) {
                boolean zRemove = super.remove(linkedHashMap.get(kVar));
                linkedHashMap.remove(kVar);
                return zRemove;
            }
        }
        return super.remove(kVar);
    }
}
