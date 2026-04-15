.class public final Ld0/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lb2/a;


# instance fields
.field public final a:Ld0/d;


# direct methods
.method public constructor <init>(Ld0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld0/a;->a:Ld0/d;

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
.method public final D(JJLyb/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    const/4 p2, 0x1

    .line 3
    invoke-static {p3, p4, p1, p1, p2}, Lf3/q;->a(JFFI)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    new-instance p3, Lf3/q;

    .line 8
    .line 9
    invoke-direct {p3, p1, p2}, Lf3/q;-><init>(J)V

    .line 10
    .line 11
    .line 12
    return-object p3
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final F(IJ)J
    .locals 7

    .line 1
    iget-object v0, p0, Ld0/a;->a:Ld0/d;

    .line 2
    .line 3
    iget-object v1, v0, Ld0/f0;->d:Ld0/y;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne p1, v2, :cond_1

    .line 7
    .line 8
    iget-object p1, v1, Ld0/y;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lx0/a1;

    .line 11
    .line 12
    invoke-virtual {p1}, Lx0/a1;->e()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    float-to-double v2, p1

    .line 21
    const-wide v4, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmpl-double p1, v2, v4

    .line 27
    .line 28
    if-lez p1, :cond_1

    .line 29
    .line 30
    iget-object p1, v1, Ld0/y;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Lx0/a1;

    .line 33
    .line 34
    invoke-virtual {p1}, Lx0/a1;->e()F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v0}, Ld0/f0;->m()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    int-to-float v2, v2

    .line 43
    mul-float p1, p1, v2

    .line 44
    .line 45
    invoke-virtual {v0}, Ld0/f0;->k()Ld0/w;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget v2, v2, Ld0/w;->b:I

    .line 50
    .line 51
    invoke-virtual {v0}, Ld0/f0;->k()Ld0/w;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget v3, v3, Ld0/w;->c:I

    .line 56
    .line 57
    add-int/2addr v2, v3

    .line 58
    int-to-float v2, v2

    .line 59
    iget-object v3, v1, Ld0/y;->d:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Lx0/a1;

    .line 62
    .line 63
    invoke-virtual {v3}, Lx0/a1;->e()F

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    neg-float v3, v3

    .line 72
    mul-float v2, v2, v3

    .line 73
    .line 74
    add-float/2addr v2, p1

    .line 75
    iget-object v1, v1, Ld0/y;->d:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Lx0/a1;

    .line 78
    .line 79
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    const/4 v3, 0x0

    .line 84
    cmpl-float v1, v1, v3

    .line 85
    .line 86
    if-lez v1, :cond_0

    .line 87
    .line 88
    move v6, v2

    .line 89
    move v2, p1

    .line 90
    move p1, v6

    .line 91
    :cond_0
    const/16 v1, 0x20

    .line 92
    .line 93
    shr-long v3, p2, v1

    .line 94
    .line 95
    long-to-int v4, v3

    .line 96
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-static {v3, p1, v2}, Lnh/b;->j(FFF)F

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    neg-float p1, p1

    .line 105
    iget-object v0, v0, Ld0/f0;->k:Lu/k;

    .line 106
    .line 107
    invoke-virtual {v0, p1}, Lu/k;->e(F)F

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    neg-float p1, p1

    .line 112
    const-wide v2, 0xffffffffL

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    and-long/2addr p2, v2

    .line 118
    long-to-int p3, p2

    .line 119
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    int-to-long v4, p1

    .line 128
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    int-to-long p1, p1

    .line 133
    shl-long v0, v4, v1

    .line 134
    .line 135
    and-long/2addr p1, v2

    .line 136
    or-long/2addr p1, v0

    .line 137
    return-wide p1

    .line 138
    :cond_1
    const-wide/16 p1, 0x0

    .line 139
    .line 140
    return-wide p1
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public final V(JLyb/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lf3/q;

    .line 2
    .line 3
    const-wide/16 p2, 0x0

    .line 4
    .line 5
    invoke-direct {p1, p2, p3}, Lf3/q;-><init>(J)V

    .line 6
    .line 7
    .line 8
    return-object p1
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
.end method

.method public final X(IJJ)J
    .locals 0

    .line 1
    const/4 p2, 0x2

    .line 2
    if-ne p1, p2, :cond_1

    .line 3
    .line 4
    const/16 p1, 0x20

    .line 5
    .line 6
    shr-long p1, p4, p1

    .line 7
    .line 8
    long-to-int p2, p1

    .line 9
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 p2, 0x0

    .line 14
    cmpg-float p1, p1, p2

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 20
    .line 21
    const-string p2, "Scroll cancelled"

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    :goto_0
    const-wide/16 p1, 0x0

    .line 28
    .line 29
    return-wide p1
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method
