.class public final Lm6/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lr5/b0;


# instance fields
.field public final synthetic a:Lm6/b;


# direct methods
.method public constructor <init>(Lm6/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm6/a;->a:Lm6/b;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
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


# virtual methods
.method public final e()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
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
.end method

.method public final k(J)Lr5/a0;
    .locals 13

    .line 1
    iget-object v0, p0, Lm6/a;->a:Lm6/b;

    .line 2
    .line 3
    iget-object v1, v0, Lm6/b;->d:Lm6/i;

    .line 4
    .line 5
    iget v1, v1, Lm6/i;->i:I

    .line 6
    .line 7
    int-to-long v1, v1

    .line 8
    mul-long v1, v1, p1

    .line 9
    .line 10
    const-wide/32 v3, 0xf4240

    .line 11
    .line 12
    .line 13
    div-long/2addr v1, v3

    .line 14
    iget-wide v3, v0, Lm6/b;->b:J

    .line 15
    .line 16
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-wide v5, v0, Lm6/b;->c:J

    .line 21
    .line 22
    sub-long v7, v5, v3

    .line 23
    .line 24
    invoke-static {v7, v8}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-wide v7, v0, Lm6/b;->f:J

    .line 33
    .line 34
    invoke-static {v7, v8}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/math/BigInteger;->longValue()J

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    add-long/2addr v1, v3

    .line 47
    const-wide/16 v3, 0x7530

    .line 48
    .line 49
    sub-long v7, v1, v3

    .line 50
    .line 51
    iget-wide v9, v0, Lm6/b;->b:J

    .line 52
    .line 53
    const-wide/16 v0, 0x1

    .line 54
    .line 55
    sub-long v11, v5, v0

    .line 56
    .line 57
    invoke-static/range {v7 .. v12}, Lp4/c0;->j(JJJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    new-instance v2, Lr5/a0;

    .line 62
    .line 63
    new-instance v3, Lr5/c0;

    .line 64
    .line 65
    invoke-direct {v3, p1, p2, v0, v1}, Lr5/c0;-><init>(JJ)V

    .line 66
    .line 67
    .line 68
    invoke-direct {v2, v3, v3}, Lr5/a0;-><init>(Lr5/c0;Lr5/c0;)V

    .line 69
    .line 70
    .line 71
    return-object v2
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

.method public final m()J
    .locals 6

    .line 1
    iget-object v0, p0, Lm6/a;->a:Lm6/b;

    .line 2
    .line 3
    iget-object v1, v0, Lm6/b;->d:Lm6/i;

    .line 4
    .line 5
    iget-wide v2, v0, Lm6/b;->f:J

    .line 6
    .line 7
    const-wide/32 v4, 0xf4240

    .line 8
    .line 9
    .line 10
    mul-long v2, v2, v4

    .line 11
    .line 12
    iget v0, v1, Lm6/i;->i:I

    .line 13
    .line 14
    int-to-long v0, v0

    .line 15
    div-long/2addr v2, v0

    .line 16
    return-wide v2
    .line 17
    .line 18
    .line 19
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
.end method
