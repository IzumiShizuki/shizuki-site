.class public final Lm0/o4;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lb2/a;


# instance fields
.field public final synthetic a:Lm0/x;


# direct methods
.method public constructor <init>(Lm0/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm0/o4;->a:Lm0/x;

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
    .locals 2

    .line 1
    instance-of p1, p5, Lm0/m4;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move-object p1, p5

    .line 6
    check-cast p1, Lm0/m4;

    .line 7
    .line 8
    iget p2, p1, Lm0/m4;->g:I

    .line 9
    .line 10
    const/high16 v0, -0x80000000

    .line 11
    .line 12
    and-int v1, p2, v0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sub-int/2addr p2, v0

    .line 17
    iput p2, p1, Lm0/m4;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Lm0/m4;

    .line 21
    .line 22
    check-cast p5, Lac/c;

    .line 23
    .line 24
    invoke-direct {p1, p0, p5}, Lm0/m4;-><init>(Lm0/o4;Lac/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, p1, Lm0/m4;->e:Ljava/lang/Object;

    .line 28
    .line 29
    iget p5, p1, Lm0/m4;->g:I

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    if-eqz p5, :cond_2

    .line 33
    .line 34
    if-ne p5, v0, :cond_1

    .line 35
    .line 36
    iget-wide p3, p1, Lm0/m4;->d:J

    .line 37
    .line 38
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p3, p4}, Lf3/q;->c(J)F

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    iput-wide p3, p1, Lm0/m4;->d:J

    .line 58
    .line 59
    iput v0, p1, Lm0/m4;->g:I

    .line 60
    .line 61
    iget-object p5, p0, Lm0/o4;->a:Lm0/x;

    .line 62
    .line 63
    invoke-virtual {p5, p2, p1}, Lm0/x;->h(FLac/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 68
    .line 69
    if-ne p1, p2, :cond_3

    .line 70
    .line 71
    return-object p2

    .line 72
    :cond_3
    :goto_1
    new-instance p1, Lf3/q;

    .line 73
    .line 74
    invoke-direct {p1, p3, p4}, Lf3/q;-><init>(J)V

    .line 75
    .line 76
    .line 77
    return-object p1
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
    .locals 2

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long/2addr p2, v0

    .line 7
    long-to-int p3, p2

    .line 8
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/4 p3, 0x0

    .line 13
    cmpg-float v0, p2, p3

    .line 14
    .line 15
    if-gez v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    if-ne p1, v0, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Lm0/o4;->a:Lm0/x;

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lm0/x;->e(F)F

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    iget-object p1, p1, Lm0/x;->j:Lx0/a1;

    .line 27
    .line 28
    invoke-virtual {p1}, Lx0/a1;->e()F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p1}, Lx0/a1;->e()F

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    :goto_0
    invoke-virtual {p1, p2}, Lx0/a1;->f(F)V

    .line 44
    .line 45
    .line 46
    sub-float/2addr p2, p3

    .line 47
    invoke-virtual {p0, p2}, Lm0/o4;->a(F)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    return-wide p1

    .line 52
    :cond_1
    const-wide/16 p1, 0x0

    .line 53
    .line 54
    return-wide p1
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public final V(JLyb/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lm0/n4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lm0/n4;

    .line 7
    .line 8
    iget v1, v0, Lm0/n4;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lm0/n4;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm0/n4;

    .line 21
    .line 22
    check-cast p3, Lac/c;

    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lm0/n4;-><init>(Lm0/o4;Lac/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p3, v0, Lm0/n4;->e:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, Lm0/n4;->g:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    iget-wide p1, v0, Lm0/n4;->d:J

    .line 37
    .line 38
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1, p2}, Lf3/q;->c(J)F

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    iget-object v1, p0, Lm0/o4;->a:Lm0/x;

    .line 58
    .line 59
    invoke-virtual {v1}, Lm0/x;->f()F

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    const/4 v4, 0x0

    .line 64
    cmpg-float v4, p3, v4

    .line 65
    .line 66
    if-gez v4, :cond_4

    .line 67
    .line 68
    invoke-virtual {v1}, Lm0/x;->d()Lm0/a4;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iget-object v4, v4, Lm0/a4;->a:Ljava/util/Map;

    .line 73
    .line 74
    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, Ljava/lang/Iterable;

    .line 79
    .line 80
    invoke-static {v4}, Lvb/m;->m0(Ljava/lang/Iterable;)Ljava/lang/Float;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    if-eqz v4, :cond_3

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    goto :goto_1

    .line 91
    :cond_3
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 92
    .line 93
    :goto_1
    cmpl-float v3, v3, v4

    .line 94
    .line 95
    if-lez v3, :cond_4

    .line 96
    .line 97
    iput-wide p1, v0, Lm0/n4;->d:J

    .line 98
    .line 99
    iput v2, v0, Lm0/n4;->g:I

    .line 100
    .line 101
    invoke-virtual {v1, p3, v0}, Lm0/x;->h(FLac/c;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 106
    .line 107
    if-ne p3, v0, :cond_5

    .line 108
    .line 109
    return-object v0

    .line 110
    :cond_4
    const-wide/16 p1, 0x0

    .line 111
    .line 112
    :cond_5
    :goto_2
    new-instance p3, Lf3/q;

    .line 113
    .line 114
    invoke-direct {p3, p1, p2}, Lf3/q;-><init>(J)V

    .line 115
    .line 116
    .line 117
    return-object p3
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
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

.method public final X(IJJ)J
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    if-ne p1, p2, :cond_1

    .line 3
    .line 4
    const-wide p1, 0xffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    and-long/2addr p1, p4

    .line 10
    long-to-int p2, p1

    .line 11
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-object p2, p0, Lm0/o4;->a:Lm0/x;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Lm0/x;->e(F)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object p2, p2, Lm0/x;->j:Lx0/a1;

    .line 22
    .line 23
    invoke-virtual {p2}, Lx0/a1;->e()F

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    if-eqz p3, :cond_0

    .line 32
    .line 33
    const/4 p3, 0x0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p2}, Lx0/a1;->e()F

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    :goto_0
    invoke-virtual {p2, p1}, Lx0/a1;->f(F)V

    .line 40
    .line 41
    .line 42
    sub-float/2addr p1, p3

    .line 43
    invoke-virtual {p0, p1}, Lm0/o4;->a(F)J

    .line 44
    .line 45
    .line 46
    move-result-wide p1

    .line 47
    return-wide p1

    .line 48
    :cond_1
    const-wide/16 p1, 0x0

    .line 49
    .line 50
    return-wide p1
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

.method public final a(F)J
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    int-to-long v0, v0

    .line 7
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    int-to-long v2, p1

    .line 12
    const/16 p1, 0x20

    .line 13
    .line 14
    shl-long/2addr v0, p1

    .line 15
    const-wide v4, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr v2, v4

    .line 21
    or-long/2addr v0, v2

    .line 22
    return-wide v0
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
