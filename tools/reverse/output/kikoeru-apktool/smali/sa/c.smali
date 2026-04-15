.class public abstract Lsa/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lsa/k;


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v0, "RGB"

    .line 2
    .line 3
    invoke-static {v0}, Ln7/b0;->u(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lqa/a;->b:Lqa/b;

    .line 7
    .line 8
    sget-object v1, Lsa/d;->a:Lsa/d;

    .line 9
    .line 10
    new-instance v1, Lsa/s;

    .line 11
    .line 12
    const-wide v2, 0x3fe6a7ef9db22d0eL    # 0.708

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-wide v3, 0x3fd2b020c49ba5e3L    # 0.292

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-direct {v1, v2, v3}, Lsa/s;-><init>(Ljava/lang/Double;Ljava/lang/Double;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Lsa/s;

    .line 34
    .line 35
    const-wide v3, 0x3fc5c28f5c28f5c3L    # 0.17

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const-wide v4, 0x3fe9810624dd2f1bL    # 0.797

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-direct {v2, v3, v4}, Lsa/s;-><init>(Ljava/lang/Double;Ljava/lang/Double;)V

    .line 54
    .line 55
    .line 56
    new-instance v3, Lsa/s;

    .line 57
    .line 58
    const-wide v4, 0x3fc0c49ba5e353f8L    # 0.131

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    const-wide v5, 0x3fa78d4fdf3b645aL    # 0.046

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-direct {v3, v4, v5}, Lsa/s;-><init>(Ljava/lang/Double;Ljava/lang/Double;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v1, v2, v3}, Lsa/n;->b(Lqa/b;Lsa/s;Lsa/s;Lsa/s;)[F

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Lnh/b;->z([F)[F

    .line 84
    .line 85
    .line 86
    return-void
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
