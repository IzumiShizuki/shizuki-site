package xf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f25011h;

    public j(boolean z10, boolean z11, boolean z12, String str, boolean z13, String str2, boolean z14, a aVar) {
        jc.l.e(str, "prettyPrintIndent");
        jc.l.e(str2, "classDiscriminator");
        jc.l.e(aVar, "classDiscriminatorMode");
        this.f25004a = z10;
        this.f25005b = z11;
        this.f25006c = z12;
        this.f25007d = str;
        this.f25008e = z13;
        this.f25009f = str2;
        this.f25010g = z14;
        this.f25011h = aVar;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f25004a + ", ignoreUnknownKeys=" + this.f25005b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f25006c + ", prettyPrintIndent='" + this.f25007d + "', coerceInputValues=" + this.f25008e + ", useArrayPolymorphism=false, classDiscriminator='" + this.f25009f + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f25010g + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f25011h + ')';
    }
}
