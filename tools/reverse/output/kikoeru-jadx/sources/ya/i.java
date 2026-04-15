package ya;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class i extends d implements SortedMap {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SortedSet f25996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v0 f25997f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v0 v0Var, SortedMap sortedMap) {
        super(v0Var, sortedMap);
        this.f25997f = v0Var;
    }

    public SortedSet b() {
        return new j(this.f25997f, d());
    }

    @Override // ya.d, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f25996e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.f25996e = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f25964c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new i(this.f25997f, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new i(this.f25997f, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new i(this.f25997f, d().tailMap(obj));
    }
}
