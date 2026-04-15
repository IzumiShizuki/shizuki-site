package gb;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Type f7469b;

    public /* synthetic */ e(Type type, int i10) {
        this.f7468a = i10;
        this.f7469b = type;
    }

    @Override // gb.o
    public final Object k() {
        switch (this.f7468a) {
            case 0:
                Type type = this.f7469b;
                if (!(type instanceof ParameterizedType)) {
                    throw new eb.p("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new eb.p("Invalid EnumSet type: " + type.toString());
            default:
                Type type3 = this.f7469b;
                if (!(type3 instanceof ParameterizedType)) {
                    throw new eb.p("Invalid EnumMap type: " + type3.toString());
                }
                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                if (type4 instanceof Class) {
                    return new EnumMap((Class) type4);
                }
                throw new eb.p("Invalid EnumMap type: " + type3.toString());
        }
    }
}
