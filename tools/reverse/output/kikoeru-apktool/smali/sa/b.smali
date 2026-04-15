.class public final Lsa/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lsa/j;


# static fields
.field public static final a:Lsa/b;

.field public static final b:D


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lsa/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsa/b;->a:Lsa/b;

    .line 7
    .line 8
    const-wide v0, 0x40effc0000000000L    # 65504.0

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    sget-wide v2, Llc/a;->a:D

    .line 18
    .line 19
    div-double/2addr v0, v2

    .line 20
    const-wide v2, 0x402370a3d70a3d71L    # 9.72

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    add-double/2addr v0, v2

    .line 26
    const-wide v2, 0x4031851eb851eb85L    # 17.52

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    div-double/2addr v0, v2

    .line 32
    sput-wide v0, Lsa/b;->b:D

    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
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


# virtual methods
.method public final a(F)F
    .locals 4

    .line 1
    float-to-double v0, p1

    .line 2
    const-wide v2, 0x3fc3df44f7d13de5L    # 0.155251141552511

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    cmpg-double p1, v0, v2

    .line 8
    .line 9
    if-gtz p1, :cond_0

    .line 10
    .line 11
    const-wide v2, 0x3fb2a9efe5118abbL    # 0.0729055341958355

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    sub-double/2addr v0, v2

    .line 17
    const-wide v2, 0x4025149a0a90f124L    # 10.5402377416545

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    div-double/2addr v0, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-wide v2, Lsa/b;->b:D

    .line 25
    .line 26
    cmpg-double p1, v0, v2

    .line 27
    .line 28
    if-gez p1, :cond_1

    .line 29
    .line 30
    const-wide v2, 0x4031851eb851eb85L    # 17.52

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    mul-double v0, v0, v2

    .line 36
    .line 37
    const-wide v2, 0x402370a3d70a3d71L    # 9.72

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    sub-double/2addr v0, v2

    .line 43
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 44
    .line 45
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const-wide v0, 0x40effc0000000000L    # 65504.0

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    :goto_0
    double-to-float p1, v0

    .line 56
    return p1
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
