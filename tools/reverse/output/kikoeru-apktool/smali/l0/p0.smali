.class public abstract Ll0/p0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lr/m;

.field public static final b:Lr/v1;

.field public static final c:J

.field public static final d:Lr/z0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lr/m;

    .line 2
    .line 3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 4
    .line 5
    invoke-direct {v0, v1, v1}, Lr/m;-><init>(FF)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ll0/p0;->a:Lr/m;

    .line 9
    .line 10
    sget-object v0, Ll0/n0;->c:Ll0/n0;

    .line 11
    .line 12
    sget-object v1, Ll0/n0;->d:Ll0/n0;

    .line 13
    .line 14
    sget-object v2, Lr/w1;->a:Lr/v1;

    .line 15
    .line 16
    new-instance v2, Lr/v1;

    .line 17
    .line 18
    invoke-direct {v2, v0, v1}, Lr/v1;-><init>(Lic/k;Lic/k;)V

    .line 19
    .line 20
    .line 21
    sput-object v2, Ll0/p0;->b:Lr/v1;

    .line 22
    .line 23
    const v0, 0x3c23d70a    # 0.01f

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    int-to-long v1, v1

    .line 31
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    int-to-long v3, v0

    .line 36
    const/16 v0, 0x20

    .line 37
    .line 38
    shl-long v0, v1, v0

    .line 39
    .line 40
    const-wide v5, 0xffffffffL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    and-long/2addr v3, v5

    .line 46
    or-long/2addr v0, v3

    .line 47
    sput-wide v0, Ll0/p0;->c:J

    .line 48
    .line 49
    new-instance v2, Lr/z0;

    .line 50
    .line 51
    new-instance v3, Lp1/b;

    .line 52
    .line 53
    invoke-direct {v3, v0, v1}, Lp1/b;-><init>(J)V

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x3

    .line 57
    invoke-direct {v2, v0, v3}, Lr/z0;-><init>(ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    sput-object v2, Ll0/p0;->d:Lr/z0;

    .line 61
    .line 62
    return-void
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
