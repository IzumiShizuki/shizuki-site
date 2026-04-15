.class public final Ll9/d;
.super Ll9/a;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final synthetic l:[Lpc/u;


# instance fields
.field public final k:Lhg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ljc/s;

    .line 2
    .line 3
    const-class v1, Ll9/d;

    .line 4
    .line 5
    const-string v2, "volume"

    .line 6
    .line 7
    const-string v3, "getVolume()D"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Ljc/s;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Ljc/z;->a:Ljc/a0;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljc/a0;->g(Ljc/s;)Lpc/t;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x1

    .line 20
    new-array v1, v1, [Lpc/u;

    .line 21
    .line 22
    aput-object v0, v1, v4

    .line 23
    .line 24
    sput-object v1, Ll9/d;->l:[Lpc/u;

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ll9/a;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    invoke-static {v2}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "volumeAudioDouble"

    .line 21
    .line 22
    invoke-static {v1, v3, v0, v2}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Ll9/d;->k:Lhg/b;

    .line 27
    .line 28
    return-void
    .line 29
.end method


# virtual methods
.method public final l(Ljava/nio/ByteBuffer;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Ll9/a;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_2

    .line 7
    .line 8
    sget-object v1, Ll9/d;->l:[Lpc/u;

    .line 9
    .line 10
    aget-object v3, v1, v2

    .line 11
    .line 12
    iget-object v4, v0, Ll9/d;->k:Lhg/b;

    .line 13
    .line 14
    invoke-virtual {v4, v3}, Lhg/b;->c(Lpc/u;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 21
    .line 22
    .line 23
    move-result-wide v5

    .line 24
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 25
    .line 26
    cmpg-double v3, v5, v7

    .line 27
    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->remaining()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-lez v3, :cond_1

    .line 36
    .line 37
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    int-to-double v5, v3

    .line 42
    const/16 v3, 0x7fff

    .line 43
    .line 44
    int-to-double v7, v3

    .line 45
    div-double/2addr v5, v7

    .line 46
    aget-object v3, v1, v2

    .line 47
    .line 48
    invoke-virtual {v4, v3}, Lhg/b;->c(Lpc/u;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Ljava/lang/Number;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 55
    .line 56
    .line 57
    move-result-wide v9

    .line 58
    mul-double v11, v9, v5

    .line 59
    .line 60
    const-wide/high16 v13, -0x4010000000000000L    # -1.0

    .line 61
    .line 62
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 63
    .line 64
    invoke-static/range {v11 .. v16}, Lnh/b;->i(DDD)D

    .line 65
    .line 66
    .line 67
    move-result-wide v5

    .line 68
    iget-object v3, v0, Ll9/a;->j:Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    mul-double v5, v5, v7

    .line 71
    .line 72
    double-to-int v5, v5

    .line 73
    int-to-short v5, v5

    .line 74
    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    iget-object v1, v0, Ll9/a;->j:Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 81
    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    return v1

    .line 85
    :cond_2
    :goto_1
    return v2
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
