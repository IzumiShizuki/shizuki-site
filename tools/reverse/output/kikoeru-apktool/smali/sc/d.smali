.class public abstract Lsc/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lsc/e;

.field public static final b:Lsc/e;

.field public static final c:Lsc/e;

.field public static final d:Lsc/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lsc/c;->b:Lsc/c;

    .line 2
    .line 3
    sget v1, Lsc/b;->a:I

    .line 4
    .line 5
    new-instance v1, Lsc/e;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v0, v2}, Lsc/e;-><init>(Lic/k;I)V

    .line 9
    .line 10
    .line 11
    sput-object v1, Lsc/d;->a:Lsc/e;

    .line 12
    .line 13
    sget-object v0, Lsc/c;->c:Lsc/c;

    .line 14
    .line 15
    new-instance v1, Lsc/e;

    .line 16
    .line 17
    invoke-direct {v1, v0, v2}, Lsc/e;-><init>(Lic/k;I)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lsc/d;->b:Lsc/e;

    .line 21
    .line 22
    sget-object v0, Lsc/c;->d:Lsc/c;

    .line 23
    .line 24
    new-instance v1, Lsc/e;

    .line 25
    .line 26
    invoke-direct {v1, v0, v2}, Lsc/e;-><init>(Lic/k;I)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Lsc/d;->c:Lsc/e;

    .line 30
    .line 31
    sget-object v0, Lsc/c;->e:Lsc/c;

    .line 32
    .line 33
    new-instance v1, Lsc/e;

    .line 34
    .line 35
    invoke-direct {v1, v0, v2}, Lsc/e;-><init>(Lic/k;I)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Lsc/c;->f:Lsc/c;

    .line 39
    .line 40
    new-instance v1, Lsc/e;

    .line 41
    .line 42
    invoke-direct {v1, v0, v2}, Lsc/e;-><init>(Lic/k;I)V

    .line 43
    .line 44
    .line 45
    sput-object v1, Lsc/d;->d:Lsc/e;

    .line 46
    .line 47
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public static final a(Ljava/lang/Class;)Lsc/d0;
    .locals 1

    .line 1
    const-string v0, "jClass"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lsc/d;->a:Lsc/e;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lsc/e;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>"

    .line 13
    .line 14
    invoke-static {p0, v0}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast p0, Lsc/d0;

    .line 18
    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method
