.class public abstract Lnh/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static a:Lw1/f; = null

.field public static b:Lw1/f; = null

.field public static c:Lw1/f; = null

.field public static d:Lw1/f; = null

.field public static e:Lw1/f; = null

.field public static f:Lw1/f; = null

.field public static g:Lw1/f; = null

.field public static h:Lw1/f; = null

.field public static i:Lw1/f; = null

.field public static j:Lw1/f; = null

.field public static k:Lw1/f; = null

.field public static l:Lw1/f; = null

.field public static m:Lw1/f; = null

.field public static n:Lw1/f; = null

.field public static o:Lw1/f; = null

.field public static p:Z = false

.field public static q:Ljava/lang/reflect/Method;


# direct methods
.method public static final A(Lyc/k0;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lyc/k0;->d()Lbd/q0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
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

.method public static B(J)J
    .locals 4

    .line 1
    const-wide/32 v0, 0xffff

    .line 2
    .line 3
    .line 4
    and-long v2, p0, v0

    .line 5
    .line 6
    long-to-int v3, v2

    .line 7
    int-to-short v2, v3

    .line 8
    const/16 v3, 0x10

    .line 9
    .line 10
    ushr-long/2addr p0, v3

    .line 11
    and-long/2addr p0, v0

    .line 12
    long-to-int p1, p0

    .line 13
    int-to-short p0, p1

    .line 14
    add-int p1, v2, p0

    .line 15
    .line 16
    int-to-short p1, p1

    .line 17
    shl-int/lit8 v0, p1, 0x9

    .line 18
    .line 19
    ushr-int/lit8 p1, p1, 0x17

    .line 20
    .line 21
    or-int/2addr p1, v0

    .line 22
    int-to-short p1, p1

    .line 23
    add-int/2addr p1, v2

    .line 24
    int-to-short p1, p1

    .line 25
    xor-int/2addr p0, v2

    .line 26
    int-to-short p0, p0

    .line 27
    shl-int/lit8 v0, v2, 0xd

    .line 28
    .line 29
    ushr-int/lit8 v1, v2, 0x13

    .line 30
    .line 31
    or-int/2addr v0, v1

    .line 32
    int-to-short v0, v0

    .line 33
    xor-int/2addr v0, p0

    .line 34
    int-to-short v0, v0

    .line 35
    shl-int/lit8 v1, p0, 0x5

    .line 36
    .line 37
    xor-int/2addr v0, v1

    .line 38
    int-to-short v0, v0

    .line 39
    shl-int/lit8 v1, p0, 0xa

    .line 40
    .line 41
    ushr-int/lit8 p0, p0, 0x16

    .line 42
    .line 43
    or-int/2addr p0, v1

    .line 44
    int-to-short p0, p0

    .line 45
    int-to-long v1, p1

    .line 46
    shl-long/2addr v1, v3

    .line 47
    int-to-long p0, p0

    .line 48
    or-long/2addr p0, v1

    .line 49
    shl-long/2addr p0, v3

    .line 50
    int-to-long v0, v0

    .line 51
    or-long/2addr p0, v0

    .line 52
    return-wide p0
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
.end method

.method public static final C(Lta/c;J)J
    .locals 5

    .line 1
    const-string v0, "color"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lta/c;->a:F

    .line 7
    .line 8
    const/high16 v1, 0x43340000    # 180.0f

    .line 9
    .line 10
    div-float/2addr v0, v1

    .line 11
    const v1, 0x40490fdb    # (float)Math.PI

    .line 12
    .line 13
    .line 14
    mul-float v0, v0, v1

    .line 15
    .line 16
    iget p0, p0, Lta/c;->b:F

    .line 17
    .line 18
    float-to-double v0, v0

    .line 19
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    double-to-float v2, v2

    .line 24
    mul-float v2, v2, p0

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    int-to-float v3, v3

    .line 28
    add-float/2addr v2, v3

    .line 29
    const/high16 v4, 0x40000000    # 2.0f

    .line 30
    .line 31
    div-float/2addr v2, v4

    .line 32
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    double-to-float v0, v0

    .line 37
    mul-float p0, p0, v0

    .line 38
    .line 39
    add-float/2addr p0, v3

    .line 40
    div-float/2addr p0, v4

    .line 41
    const/16 v0, 0x20

    .line 42
    .line 43
    shr-long v0, p1, v0

    .line 44
    .line 45
    long-to-int v1, v0

    .line 46
    int-to-float v0, v1

    .line 47
    mul-float v2, v2, v0

    .line 48
    .line 49
    const-wide v0, 0xffffffffL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long/2addr p1, v0

    .line 55
    long-to-int p2, p1

    .line 56
    int-to-float p1, p2

    .line 57
    mul-float p0, p0, p1

    .line 58
    .line 59
    invoke-static {v2, p0}, Lu3/x0;->b(FF)J

    .line 60
    .line 61
    .line 62
    move-result-wide p0

    .line 63
    return-wide p0
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
    .line 115
    .line 116
    .line 117
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

.method public static D(Loc/d;I)Loc/b;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-lez p1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget v0, p0, Loc/b;->a:I

    .line 18
    .line 19
    iget v1, p0, Loc/b;->b:I

    .line 20
    .line 21
    iget p0, p0, Loc/b;->c:I

    .line 22
    .line 23
    if-lez p0, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    neg-int p1, p1

    .line 27
    :goto_1
    new-instance p0, Loc/b;

    .line 28
    .line 29
    invoke-direct {p0, v0, v1, p1}, Loc/b;-><init>(III)V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    new-instance p1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v0, "Step must be positive, was: "

    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const/16 v0, 0x2e

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p0
    .line 58
.end method

.method public static E(II)Loc/d;
    .locals 2

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-gt p1, v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Loc/d;->d:Loc/d;

    .line 6
    .line 7
    sget-object p0, Loc/d;->d:Loc/d;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Loc/d;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    sub-int/2addr p1, v1

    .line 14
    invoke-direct {v0, p0, p1, v1}, Loc/b;-><init>(III)V

    .line 15
    .line 16
    .line 17
    return-object v0
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

.method public static final F(Lq2/o;ILp2/g;)V
    .locals 8

    .line 1
    new-instance v0, Lz0/e;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    new-array v1, v1, [Lq2/o;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0, v1, v1}, Lq2/o;->i(ZZ)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    iget v2, v0, Lz0/e;->c:I

    .line 16
    .line 17
    invoke-virtual {v0, v2, p0}, Lz0/e;->c(ILjava/util/List;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    :goto_1
    iget p0, v0, Lz0/e;->c:I

    .line 21
    .line 22
    if-eqz p0, :cond_7

    .line 23
    .line 24
    add-int/lit8 p0, p0, -0x1

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Lz0/e;->k(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lq2/o;

    .line 31
    .line 32
    invoke-static {p0}, Lq2/r;->e(Lq2/o;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iget-object v3, p0, Lq2/o;->d:Lq2/k;

    .line 37
    .line 38
    iget-object v4, v3, Lq2/k;->a:Lo/k0;

    .line 39
    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    sget-object v2, Lq2/t;->i:Lq2/w;

    .line 43
    .line 44
    invoke-virtual {v4, v2}, Lo/k0;->c(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {p0}, Lq2/o;->d()Li2/g1;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-eqz v2, :cond_6

    .line 56
    .line 57
    invoke-static {v2}, Lg2/n1;->g(Lg2/c0;)Lp1/c;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-static {v5}, Lg8/a;->X(Lp1/c;)Lf3/k;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    iget v6, v5, Lf3/k;->a:I

    .line 66
    .line 67
    iget v7, v5, Lf3/k;->c:I

    .line 68
    .line 69
    if-ge v6, v7, :cond_0

    .line 70
    .line 71
    iget v6, v5, Lf3/k;->b:I

    .line 72
    .line 73
    iget v7, v5, Lf3/k;->d:I

    .line 74
    .line 75
    if-lt v6, v7, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    sget-object v6, Lq2/j;->e:Lq2/w;

    .line 79
    .line 80
    iget-object v3, v3, Lq2/k;->a:Lo/k0;

    .line 81
    .line 82
    invoke-virtual {v3, v6}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const/4 v6, 0x0

    .line 87
    if-nez v3, :cond_3

    .line 88
    .line 89
    move-object v3, v6

    .line 90
    :cond_3
    check-cast v3, Lic/n;

    .line 91
    .line 92
    sget-object v7, Lq2/t;->u:Lq2/w;

    .line 93
    .line 94
    invoke-virtual {v4, v7}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    if-nez v4, :cond_4

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    move-object v6, v4

    .line 102
    :goto_2
    check-cast v6, Lq2/i;

    .line 103
    .line 104
    if-eqz v3, :cond_5

    .line 105
    .line 106
    if-eqz v6, :cond_5

    .line 107
    .line 108
    iget-object v3, v6, Lq2/i;->b:Ljc/m;

    .line 109
    .line 110
    invoke-interface {v3}, Lic/a;->b()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    check-cast v3, Ljava/lang/Number;

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    const/4 v4, 0x0

    .line 121
    cmpl-float v3, v3, v4

    .line 122
    .line 123
    if-lez v3, :cond_5

    .line 124
    .line 125
    add-int/lit8 v3, p1, 0x1

    .line 126
    .line 127
    new-instance v4, Lp2/h;

    .line 128
    .line 129
    invoke-direct {v4, p0, v3, v5, v2}, Lp2/h;-><init>(Lq2/o;ILf3/k;Li2/g1;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2, v4}, Lp2/g;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    invoke-static {p0, v3, p2}, Lnh/b;->F(Lq2/o;ILp2/g;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_5
    invoke-virtual {p0, v1, v1}, Lq2/o;->i(ZZ)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :cond_6
    const-string p0, "Expected semantics node to have a coordinator."

    .line 146
    .line 147
    invoke-static {p0}, Lj2/h0;->g(Ljava/lang/String;)Lce/j0;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    throw p0

    .line 152
    :cond_7
    return-void
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
.end method

.method public static final a(ILic/k;Lj1/q;Lx0/o;)V
    .locals 4

    .line 1
    const v0, -0x3799f46e

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Lx0/o;->Y(I)Lx0/o;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p0, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p3, p2}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p0

    .line 23
    :goto_1
    and-int/lit8 v1, p0, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p3, p1}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit8 v1, v0, 0x13

    .line 40
    .line 41
    const/16 v2, 0x12

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    if-eq v1, v2, :cond_4

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_3

    .line 48
    :cond_4
    const/4 v1, 0x0

    .line 49
    :goto_3
    and-int/2addr v0, v3

    .line 50
    invoke-virtual {p3, v0, v1}, Lx0/o;->N(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_5

    .line 55
    .line 56
    invoke-static {p2, p1}, Landroidx/compose/ui/draw/a;->a(Lj1/q;Lic/k;)Lj1/q;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0, p3}, Ly/d;->d(Lj1/q;Lx0/o;)V

    .line 61
    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_5
    invoke-virtual {p3}, Lx0/o;->Q()V

    .line 65
    .line 66
    .line 67
    :goto_4
    invoke-virtual {p3}, Lx0/o;->r()Lx0/p1;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    if-eqz p3, :cond_6

    .line 72
    .line 73
    new-instance v0, Li3/l;

    .line 74
    .line 75
    invoke-direct {v0, p2, p1, p0}, Li3/l;-><init>(Lj1/q;Lic/k;I)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p3, Lx0/p1;->d:Lic/n;

    .line 79
    .line 80
    :cond_6
    return-void
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
    .line 115
    .line 116
    .line 117
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
.end method

.method public static final b(ILta/c;ZZLx0/o;I)V
    .locals 28

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v0, p3

    .line 6
    .line 7
    move-object/from16 v10, p4

    .line 8
    .line 9
    move/from16 v11, p5

    .line 10
    .line 11
    const-string v3, "hsvColor"

    .line 12
    .line 13
    invoke-static {v2, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const v3, 0x52b018e0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v10, v3}, Lx0/o;->Y(I)Lx0/o;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v3, v11, 0xe

    .line 23
    .line 24
    const/4 v13, 0x4

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v10, v1}, Lx0/o;->d(I)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v3, 0x2

    .line 36
    :goto_0
    or-int/2addr v3, v11

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v3, v11

    .line 39
    :goto_1
    and-int/lit8 v4, v11, 0x70

    .line 40
    .line 41
    if-nez v4, :cond_3

    .line 42
    .line 43
    invoke-virtual {v10, v2}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    const/16 v4, 0x20

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v4, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr v3, v4

    .line 55
    :cond_3
    and-int/lit16 v4, v11, 0x380

    .line 56
    .line 57
    move/from16 v15, p2

    .line 58
    .line 59
    if-nez v4, :cond_5

    .line 60
    .line 61
    invoke-virtual {v10, v15}, Lx0/o;->g(Z)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_4

    .line 66
    .line 67
    const/16 v4, 0x100

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    const/16 v4, 0x80

    .line 71
    .line 72
    :goto_3
    or-int/2addr v3, v4

    .line 73
    :cond_5
    and-int/lit16 v4, v11, 0x1c00

    .line 74
    .line 75
    if-nez v4, :cond_7

    .line 76
    .line 77
    invoke-virtual {v10, v0}, Lx0/o;->g(Z)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_6

    .line 82
    .line 83
    const/16 v4, 0x800

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_6
    const/16 v4, 0x400

    .line 87
    .line 88
    :goto_4
    or-int/2addr v3, v4

    .line 89
    :cond_7
    const v4, 0xe000

    .line 90
    .line 91
    .line 92
    and-int/2addr v4, v11

    .line 93
    if-nez v4, :cond_9

    .line 94
    .line 95
    sget-object v4, Lua/b;->a:Lua/b;

    .line 96
    .line 97
    invoke-virtual {v10, v4}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_8

    .line 102
    .line 103
    const/16 v4, 0x4000

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_8
    const/16 v4, 0x2000

    .line 107
    .line 108
    :goto_5
    or-int/2addr v3, v4

    .line 109
    :cond_9
    move/from16 v22, v3

    .line 110
    .line 111
    const v3, 0xb6db

    .line 112
    .line 113
    .line 114
    and-int v3, v22, v3

    .line 115
    .line 116
    const/16 v4, 0x2492

    .line 117
    .line 118
    if-ne v3, v4, :cond_b

    .line 119
    .line 120
    invoke-virtual {v10}, Lx0/o;->z()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-nez v3, :cond_a

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_a
    invoke-virtual {v10}, Lx0/o;->Q()V

    .line 128
    .line 129
    .line 130
    goto/16 :goto_13

    .line 131
    .line 132
    :cond_b
    :goto_6
    invoke-static {v1, v1}, Lgh/g;->c(II)J

    .line 133
    .line 134
    .line 135
    move-result-wide v6

    .line 136
    new-instance v3, Lf3/l;

    .line 137
    .line 138
    invoke-direct {v3, v6, v7}, Lf3/l;-><init>(J)V

    .line 139
    .line 140
    .line 141
    const v4, 0x1e7b2b64

    .line 142
    .line 143
    .line 144
    invoke-virtual {v10, v4}, Lx0/o;->X(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v10, v2}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    invoke-virtual {v10, v3}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    or-int/2addr v3, v4

    .line 156
    invoke-virtual {v10}, Lx0/o;->K()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    sget-object v14, Lx0/k;->a:Lx0/r0;

    .line 161
    .line 162
    if-nez v3, :cond_c

    .line 163
    .line 164
    if-ne v4, v14, :cond_d

    .line 165
    .line 166
    :cond_c
    invoke-static {v2, v6, v7}, Lnh/b;->C(Lta/c;J)J

    .line 167
    .line 168
    .line 169
    move-result-wide v3

    .line 170
    new-instance v5, Lp1/b;

    .line 171
    .line 172
    invoke-direct {v5, v3, v4}, Lp1/b;-><init>(J)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v10, v5}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    move-object v4, v5

    .line 179
    :cond_d
    const/4 v3, 0x0

    .line 180
    invoke-virtual {v10, v3}, Lx0/o;->p(Z)V

    .line 181
    .line 182
    .line 183
    check-cast v4, Lp1/b;

    .line 184
    .line 185
    iget-wide v4, v4, Lp1/b;->a:J

    .line 186
    .line 187
    const v8, -0x1d58f75c

    .line 188
    .line 189
    .line 190
    invoke-virtual {v10, v8}, Lx0/o;->X(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v10}, Lx0/o;->K()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    if-ne v9, v14, :cond_e

    .line 198
    .line 199
    new-instance v9, Lr/c;

    .line 200
    .line 201
    new-instance v8, Lp1/b;

    .line 202
    .line 203
    invoke-direct {v8, v4, v5}, Lp1/b;-><init>(J)V

    .line 204
    .line 205
    .line 206
    sget-object v4, Lr/w1;->a:Lr/v1;

    .line 207
    .line 208
    invoke-direct {v9, v8}, Lr/c;-><init>(Lp1/b;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v10, v9}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :cond_e
    invoke-virtual {v10, v3}, Lx0/o;->p(Z)V

    .line 215
    .line 216
    .line 217
    move-object v4, v9

    .line 218
    check-cast v4, Lr/c;

    .line 219
    .line 220
    new-instance v5, Lf3/l;

    .line 221
    .line 222
    invoke-direct {v5, v6, v7}, Lf3/l;-><init>(J)V

    .line 223
    .line 224
    .line 225
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    new-instance v2, Lua/e;

    .line 230
    .line 231
    move-object v9, v8

    .line 232
    const/4 v8, 0x0

    .line 233
    move-object/from16 v17, v9

    .line 234
    .line 235
    const/4 v9, 0x0

    .line 236
    move v3, v15

    .line 237
    move-object/from16 v12, v17

    .line 238
    .line 239
    const/16 v16, 0x2

    .line 240
    .line 241
    move-object v15, v5

    .line 242
    move-object/from16 v5, p1

    .line 243
    .line 244
    invoke-direct/range {v2 .. v9}, Lua/e;-><init>(ZLr/c;Lta/c;JLyb/c;I)V

    .line 245
    .line 246
    .line 247
    move-object v3, v2

    .line 248
    move-object/from16 v25, v4

    .line 249
    .line 250
    move-object v2, v5

    .line 251
    move-wide/from16 v18, v6

    .line 252
    .line 253
    invoke-static {v2, v15, v12, v3, v10}, Lx0/v;->g(Lta/c;Lf3/l;Ljava/lang/Boolean;Lic/n;Lx0/o;)V

    .line 254
    .line 255
    .line 256
    sget-object v3, Lj2/l1;->h:Lx0/o2;

    .line 257
    .line 258
    invoke-virtual {v10, v3}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    check-cast v3, Lf3/c;

    .line 263
    .line 264
    invoke-interface {v3, v1}, Lf3/c;->I(I)F

    .line 265
    .line 266
    .line 267
    move-result v12

    .line 268
    if-nez v0, :cond_f

    .line 269
    .line 270
    const v3, 0x3e3851ec    # 0.18f

    .line 271
    .line 272
    .line 273
    :goto_7
    mul-float v3, v3, v12

    .line 274
    .line 275
    goto :goto_8

    .line 276
    :cond_f
    const v3, 0x3e19999a    # 0.15f

    .line 277
    .line 278
    .line 279
    goto :goto_7

    .line 280
    :goto_8
    sget-object v4, Lr/e;->b:Lr/z0;

    .line 281
    .line 282
    new-instance v2, Lf3/f;

    .line 283
    .line 284
    invoke-direct {v2, v3}, Lf3/f;-><init>(F)V

    .line 285
    .line 286
    .line 287
    sget-object v3, Lr/w1;->c:Lr/v1;

    .line 288
    .line 289
    const/4 v8, 0x0

    .line 290
    const/16 v9, 0x18

    .line 291
    .line 292
    const/4 v5, 0x0

    .line 293
    const/4 v6, 0x0

    .line 294
    move-object v7, v10

    .line 295
    move-wide/from16 v26, v18

    .line 296
    .line 297
    move-object/from16 v10, p1

    .line 298
    .line 299
    invoke-static/range {v2 .. v9}, Lr/e;->c(Ljava/lang/Object;Lr/v1;Lr/j;Ljava/lang/Float;Ljava/lang/String;Lx0/o;II)Lx0/n2;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    move-object v6, v7

    .line 304
    const v2, 0x6f3b57dc

    .line 305
    .line 306
    .line 307
    invoke-virtual {v6, v2}, Lx0/o;->X(I)V

    .line 308
    .line 309
    .line 310
    iget v2, v10, Lta/c;->c:F

    .line 311
    .line 312
    const v9, 0x3dcccccd    # 0.1f

    .line 313
    .line 314
    .line 315
    sub-float v3, v2, v9

    .line 316
    .line 317
    const/high16 v4, 0x3f800000    # 1.0f

    .line 318
    .line 319
    rem-float/2addr v3, v4

    .line 320
    const/4 v5, 0x0

    .line 321
    cmpg-float v7, v3, v5

    .line 322
    .line 323
    if-nez v7, :cond_10

    .line 324
    .line 325
    goto :goto_9

    .line 326
    :cond_10
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 327
    .line 328
    .line 329
    move-result v7

    .line 330
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 331
    .line 332
    .line 333
    move-result v15

    .line 334
    cmpg-float v7, v7, v15

    .line 335
    .line 336
    if-nez v7, :cond_11

    .line 337
    .line 338
    goto :goto_9

    .line 339
    :cond_11
    add-float/2addr v3, v4

    .line 340
    :goto_9
    const v7, 0x3e4ccccd    # 0.2f

    .line 341
    .line 342
    .line 343
    cmpg-float v15, v3, v7

    .line 344
    .line 345
    if-gez v15, :cond_12

    .line 346
    .line 347
    const v3, 0x3e4ccccd    # 0.2f

    .line 348
    .line 349
    .line 350
    :cond_12
    const/16 v15, 0xb

    .line 351
    .line 352
    invoke-static {v10, v5, v5, v3, v15}, Lta/c;->a(Lta/c;FFFI)Lta/c;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    const v17, 0x3f0ccccd    # 0.55f

    .line 357
    .line 358
    .line 359
    add-float v18, v2, v17

    .line 360
    .line 361
    rem-float v18, v18, v4

    .line 362
    .line 363
    cmpg-float v19, v18, v5

    .line 364
    .line 365
    if-nez v19, :cond_13

    .line 366
    .line 367
    goto :goto_a

    .line 368
    :cond_13
    invoke-static/range {v18 .. v18}, Ljava/lang/Math;->signum(F)F

    .line 369
    .line 370
    .line 371
    move-result v19

    .line 372
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 373
    .line 374
    .line 375
    move-result v20

    .line 376
    cmpg-float v19, v19, v20

    .line 377
    .line 378
    if-nez v19, :cond_14

    .line 379
    .line 380
    goto :goto_a

    .line 381
    :cond_14
    add-float v18, v18, v4

    .line 382
    .line 383
    :goto_a
    cmpg-float v19, v18, v17

    .line 384
    .line 385
    if-gez v19, :cond_15

    .line 386
    .line 387
    const v4, 0x3f0ccccd    # 0.55f

    .line 388
    .line 389
    .line 390
    :goto_b
    const/high16 v17, 0x3f800000    # 1.0f

    .line 391
    .line 392
    goto :goto_c

    .line 393
    :cond_15
    move/from16 v4, v18

    .line 394
    .line 395
    goto :goto_b

    .line 396
    :goto_c
    invoke-static {v10, v5, v5, v4, v15}, Lta/c;->a(Lta/c;FFFI)Lta/c;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    const v18, 0x3e99999a    # 0.3f

    .line 401
    .line 402
    .line 403
    add-float v19, v2, v18

    .line 404
    .line 405
    rem-float v19, v19, v17

    .line 406
    .line 407
    cmpg-float v20, v19, v5

    .line 408
    .line 409
    if-nez v20, :cond_16

    .line 410
    .line 411
    goto :goto_d

    .line 412
    :cond_16
    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->signum(F)F

    .line 413
    .line 414
    .line 415
    move-result v20

    .line 416
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->signum(F)F

    .line 417
    .line 418
    .line 419
    move-result v21

    .line 420
    cmpg-float v20, v20, v21

    .line 421
    .line 422
    if-nez v20, :cond_17

    .line 423
    .line 424
    goto :goto_d

    .line 425
    :cond_17
    add-float v19, v19, v17

    .line 426
    .line 427
    :goto_d
    cmpg-float v20, v19, v18

    .line 428
    .line 429
    if-gez v20, :cond_18

    .line 430
    .line 431
    const v7, 0x3e99999a    # 0.3f

    .line 432
    .line 433
    .line 434
    :goto_e
    const v18, 0x3e4ccccd    # 0.2f

    .line 435
    .line 436
    .line 437
    goto :goto_f

    .line 438
    :cond_18
    move/from16 v7, v19

    .line 439
    .line 440
    goto :goto_e

    .line 441
    :goto_f
    invoke-static {v10, v5, v5, v7, v15}, Lta/c;->a(Lta/c;FFFI)Lta/c;

    .line 442
    .line 443
    .line 444
    move-result-object v7

    .line 445
    const v19, 0x3d4ccccd    # 0.05f

    .line 446
    .line 447
    .line 448
    add-float v2, v2, v19

    .line 449
    .line 450
    rem-float v2, v2, v17

    .line 451
    .line 452
    cmpg-float v19, v2, v5

    .line 453
    .line 454
    if-nez v19, :cond_19

    .line 455
    .line 456
    goto :goto_10

    .line 457
    :cond_19
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 458
    .line 459
    .line 460
    move-result v19

    .line 461
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->signum(F)F

    .line 462
    .line 463
    .line 464
    move-result v20

    .line 465
    cmpg-float v19, v19, v20

    .line 466
    .line 467
    if-nez v19, :cond_1a

    .line 468
    .line 469
    goto :goto_10

    .line 470
    :cond_1a
    add-float v2, v2, v17

    .line 471
    .line 472
    :goto_10
    cmpg-float v17, v2, v18

    .line 473
    .line 474
    if-gez v17, :cond_1b

    .line 475
    .line 476
    const v2, 0x3e4ccccd    # 0.2f

    .line 477
    .line 478
    .line 479
    :cond_1b
    invoke-static {v10, v5, v5, v2, v15}, Lta/c;->a(Lta/c;FFFI)Lta/c;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    new-array v5, v13, [Lta/c;

    .line 484
    .line 485
    const/4 v13, 0x0

    .line 486
    aput-object v3, v5, v13

    .line 487
    .line 488
    const/4 v3, 0x1

    .line 489
    aput-object v4, v5, v3

    .line 490
    .line 491
    aput-object v7, v5, v16

    .line 492
    .line 493
    const/4 v3, 0x3

    .line 494
    aput-object v2, v5, v3

    .line 495
    .line 496
    invoke-static {v5}, Lud/b;->x([Ljava/lang/Object;)Ljava/util/List;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    check-cast v2, Ljava/lang/Iterable;

    .line 501
    .line 502
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 503
    .line 504
    .line 505
    move-result-object v24

    .line 506
    :goto_11
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    .line 507
    .line 508
    .line 509
    move-result v2

    .line 510
    if-eqz v2, :cond_1d

    .line 511
    .line 512
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    move-object v4, v2

    .line 517
    check-cast v4, Lta/c;

    .line 518
    .line 519
    const v2, -0x1d58f75c

    .line 520
    .line 521
    .line 522
    invoke-virtual {v6, v2}, Lx0/o;->X(I)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v6}, Lx0/o;->K()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    if-ne v3, v14, :cond_1c

    .line 530
    .line 531
    new-instance v3, Lr/c;

    .line 532
    .line 533
    move-object v5, v14

    .line 534
    move-wide/from16 v9, v26

    .line 535
    .line 536
    const v23, 0x3dcccccd    # 0.1f

    .line 537
    .line 538
    .line 539
    invoke-static {v4, v9, v10}, Lnh/b;->C(Lta/c;J)J

    .line 540
    .line 541
    .line 542
    move-result-wide v13

    .line 543
    new-instance v7, Lp1/b;

    .line 544
    .line 545
    invoke-direct {v7, v13, v14}, Lp1/b;-><init>(J)V

    .line 546
    .line 547
    .line 548
    sget-object v13, Lr/w1;->a:Lr/v1;

    .line 549
    .line 550
    invoke-direct {v3, v7}, Lr/c;-><init>(Lp1/b;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v6, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    const/4 v13, 0x0

    .line 557
    goto :goto_12

    .line 558
    :cond_1c
    move-object v5, v14

    .line 559
    move-wide/from16 v9, v26

    .line 560
    .line 561
    const v23, 0x3dcccccd    # 0.1f

    .line 562
    .line 563
    .line 564
    :goto_12
    invoke-virtual {v6, v13}, Lx0/o;->p(Z)V

    .line 565
    .line 566
    .line 567
    move-object/from16 v16, v3

    .line 568
    .line 569
    check-cast v16, Lr/c;

    .line 570
    .line 571
    new-instance v3, Lf3/l;

    .line 572
    .line 573
    invoke-direct {v3, v9, v10}, Lf3/l;-><init>(J)V

    .line 574
    .line 575
    .line 576
    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 577
    .line 578
    .line 579
    move-result-object v7

    .line 580
    new-instance v14, Lua/e;

    .line 581
    .line 582
    const/16 v20, 0x0

    .line 583
    .line 584
    const/16 v21, 0x1

    .line 585
    .line 586
    move/from16 v15, p2

    .line 587
    .line 588
    move-object/from16 v17, v4

    .line 589
    .line 590
    move-wide/from16 v18, v9

    .line 591
    .line 592
    move-object v9, v5

    .line 593
    invoke-direct/range {v14 .. v21}, Lua/e;-><init>(ZLr/c;Lta/c;JLyb/c;I)V

    .line 594
    .line 595
    .line 596
    invoke-static {v4, v3, v7, v14, v6}, Lx0/v;->g(Lta/c;Lf3/l;Ljava/lang/Boolean;Lic/n;Lx0/o;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v16 .. v16}, Lr/c;->e()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    check-cast v3, Lp1/b;

    .line 604
    .line 605
    iget-wide v13, v3, Lp1/b;->a:J

    .line 606
    .line 607
    mul-float v5, v12, v23

    .line 608
    .line 609
    const/4 v7, 0x0

    .line 610
    move-wide v2, v13

    .line 611
    const v16, -0x1d58f75c

    .line 612
    .line 613
    .line 614
    invoke-static/range {v2 .. v7}, Lua/l;->F(JLta/c;FLx0/o;I)V

    .line 615
    .line 616
    .line 617
    move-object/from16 v10, p1

    .line 618
    .line 619
    move-object v14, v9

    .line 620
    move-wide/from16 v26, v18

    .line 621
    .line 622
    const v9, 0x3dcccccd    # 0.1f

    .line 623
    .line 624
    .line 625
    const/4 v13, 0x0

    .line 626
    goto :goto_11

    .line 627
    :cond_1d
    invoke-virtual {v6, v13}, Lx0/o;->p(Z)V

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v25 .. v25}, Lr/c;->e()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    check-cast v2, Lp1/b;

    .line 635
    .line 636
    iget-wide v2, v2, Lp1/b;->a:J

    .line 637
    .line 638
    invoke-interface {v8}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v4

    .line 642
    check-cast v4, Lf3/f;

    .line 643
    .line 644
    iget v5, v4, Lf3/f;->a:F

    .line 645
    .line 646
    and-int/lit8 v7, v22, 0x70

    .line 647
    .line 648
    move-object/from16 v4, p1

    .line 649
    .line 650
    invoke-static/range {v2 .. v7}, Lua/l;->F(JLta/c;FLx0/o;I)V

    .line 651
    .line 652
    .line 653
    :goto_13
    invoke-virtual/range {p4 .. p4}, Lx0/o;->r()Lx0/p1;

    .line 654
    .line 655
    .line 656
    move-result-object v6

    .line 657
    if-nez v6, :cond_1e

    .line 658
    .line 659
    return-void

    .line 660
    :cond_1e
    new-instance v0, Lua/f;

    .line 661
    .line 662
    move-object/from16 v2, p1

    .line 663
    .line 664
    move/from16 v3, p2

    .line 665
    .line 666
    move/from16 v4, p3

    .line 667
    .line 668
    move v5, v11

    .line 669
    invoke-direct/range {v0 .. v5}, Lua/f;-><init>(ILta/c;ZZI)V

    .line 670
    .line 671
    .line 672
    iput-object v0, v6, Lx0/p1;->d:Lic/n;

    .line 673
    .line 674
    return-void
.end method

.method public static final c(Lqa/b;)Lsa/q;
    .locals 1

    .line 1
    const-string v0, "whitePoint"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lqa/a;->b:Lqa/b;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lqa/b;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object p0, Lsa/r;->a:Lsa/q;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object v0, Lqa/a;->a:Lqa/b;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lqa/b;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object p0, Lsa/r;->b:Lsa/q;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    new-instance v0, Lsa/q;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Lsa/q;-><init>(Lqa/b;)V

    .line 31
    .line 32
    .line 33
    return-object v0
    .line 34
    .line 35
    .line 36
.end method

.method public static final d([F)I
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    return v2

    .line 8
    :cond_0
    aget v0, p0, v2

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/high16 v3, 0x3f800000    # 1.0f

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    cmpg-float v0, v0, v3

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    aget v0, p0, v1

    .line 19
    .line 20
    cmpg-float v0, v0, v4

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    aget v0, p0, v0

    .line 26
    .line 27
    cmpg-float v0, v0, v4

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x4

    .line 32
    aget v0, p0, v0

    .line 33
    .line 34
    cmpg-float v0, v0, v4

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x5

    .line 39
    aget v0, p0, v0

    .line 40
    .line 41
    cmpg-float v0, v0, v3

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    const/4 v0, 0x6

    .line 46
    aget v0, p0, v0

    .line 47
    .line 48
    cmpg-float v0, v0, v4

    .line 49
    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    const/16 v0, 0x8

    .line 53
    .line 54
    aget v0, p0, v0

    .line 55
    .line 56
    cmpg-float v0, v0, v4

    .line 57
    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    const/16 v0, 0x9

    .line 61
    .line 62
    aget v0, p0, v0

    .line 63
    .line 64
    cmpg-float v0, v0, v4

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    const/16 v0, 0xa

    .line 69
    .line 70
    aget v0, p0, v0

    .line 71
    .line 72
    cmpg-float v0, v0, v3

    .line 73
    .line 74
    if-nez v0, :cond_1

    .line 75
    .line 76
    const/4 v0, 0x1

    .line 77
    goto :goto_0

    .line 78
    :cond_1
    const/4 v0, 0x0

    .line 79
    :goto_0
    const/16 v5, 0xc

    .line 80
    .line 81
    aget v5, p0, v5

    .line 82
    .line 83
    cmpg-float v5, v5, v4

    .line 84
    .line 85
    if-nez v5, :cond_2

    .line 86
    .line 87
    const/16 v5, 0xd

    .line 88
    .line 89
    aget v5, p0, v5

    .line 90
    .line 91
    cmpg-float v5, v5, v4

    .line 92
    .line 93
    if-nez v5, :cond_2

    .line 94
    .line 95
    const/16 v5, 0xe

    .line 96
    .line 97
    aget v5, p0, v5

    .line 98
    .line 99
    cmpg-float v4, v5, v4

    .line 100
    .line 101
    if-nez v4, :cond_2

    .line 102
    .line 103
    const/16 v4, 0xf

    .line 104
    .line 105
    aget p0, p0, v4

    .line 106
    .line 107
    cmpg-float p0, p0, v3

    .line 108
    .line 109
    if-nez p0, :cond_2

    .line 110
    .line 111
    const/4 v2, 0x1

    .line 112
    :cond_2
    shl-int/lit8 p0, v0, 0x1

    .line 113
    .line 114
    or-int/2addr p0, v2

    .line 115
    return p0
    .line 116
    .line 117
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public static final e(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v1, "getParameterTypes(...)"

    .line 18
    .line 19
    invoke-static {v2, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget-object v6, Lsc/c;->o:Lsc/c;

    .line 23
    .line 24
    const/16 v7, 0x18

    .line 25
    .line 26
    const-string v3, ""

    .line 27
    .line 28
    const-string v4, "("

    .line 29
    .line 30
    const-string v5, ")"

    .line 31
    .line 32
    invoke-static/range {v2 .. v7}, Lvb/l;->D0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lic/k;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string v1, "getReturnType(...)"

    .line 44
    .line 45
    invoke-static {p0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, Led/d;->b(Ljava/lang/Class;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
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

.method public static final f(J)Z
    .locals 2

    .line 1
    const-wide v0, 0x7fffffff7fffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, v0, v1}, Lf3/j;->b(JJ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    xor-int/lit8 p0, p0, 0x1

    .line 11
    .line 12
    return p0
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

.method public static final g(Lt/l;)V
    .locals 1

    .line 1
    sget-object v0, Lt/i;->a:Lt/i;

    .line 2
    .line 3
    iget-object p0, p0, Lt/l;->a:Lx0/e1;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public static h(FF)F
    .locals 1

    .line 1
    cmpl-float v0, p0, p1

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    return p0
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

.method public static i(DDD)D
    .locals 1

    .line 1
    cmpl-double v0, p2, p4

    .line 2
    .line 3
    if-gtz v0, :cond_2

    .line 4
    .line 5
    cmpg-double v0, p0, p2

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return-wide p2

    .line 10
    :cond_0
    cmpl-double p2, p0, p4

    .line 11
    .line 12
    if-lez p2, :cond_1

    .line 13
    .line 14
    return-wide p4

    .line 15
    :cond_1
    return-wide p0

    .line 16
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v0, "Cannot coerce value to an empty range: maximum "

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p4, " is less than minimum "

    .line 29
    .line 30
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p2, 0x2e

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0
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

.method public static j(FFF)F
    .locals 2

    .line 1
    cmpl-float v0, p1, p2

    .line 2
    .line 3
    if-gtz v0, :cond_2

    .line 4
    .line 5
    cmpg-float v0, p0, p1

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    cmpl-float p1, p0, p2

    .line 11
    .line 12
    if-lez p1, :cond_1

    .line 13
    .line 14
    return p2

    .line 15
    :cond_1
    return p0

    .line 16
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "Cannot coerce value to an empty range: maximum "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p2, " is less than minimum "

    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p1, 0x2e

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0
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

.method public static k(III)I
    .locals 2

    .line 1
    if-gt p1, p2, :cond_2

    .line 2
    .line 3
    if-ge p0, p1, :cond_0

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    if-le p0, p2, :cond_1

    .line 7
    .line 8
    return p2

    .line 9
    :cond_1
    return p0

    .line 10
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "Cannot coerce value to an empty range: maximum "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p2, " is less than minimum "

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 p1, 0x2e

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0
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

.method public static l(JJJ)J
    .locals 1

    .line 1
    cmp-long v0, p2, p4

    .line 2
    .line 3
    if-gtz v0, :cond_2

    .line 4
    .line 5
    cmp-long v0, p0, p2

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return-wide p2

    .line 10
    :cond_0
    cmp-long p2, p0, p4

    .line 11
    .line 12
    if-lez p2, :cond_1

    .line 13
    .line 14
    return-wide p4

    .line 15
    :cond_1
    return-wide p0

    .line 16
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v0, "Cannot coerce value to an empty range: maximum "

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p4, " is less than minimum "

    .line 29
    .line 30
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p2, 0x2e

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0
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

.method public static m(Ljava/lang/Float;Loc/a;)Ljava/lang/Comparable;
    .locals 3

    .line 1
    const-string v0, "range"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p1, Loc/a;->b:F

    .line 7
    .line 8
    iget v1, p1, Loc/a;->a:F

    .line 9
    .line 10
    cmpg-float v2, v1, v0

    .line 11
    .line 12
    if-gtz v2, :cond_2

    .line 13
    .line 14
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p0, p1}, Loc/a;->a(Ljava/lang/Float;Ljava/lang/Float;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1, p0}, Loc/a;->a(Ljava/lang/Float;Ljava/lang/Float;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1, p0}, Loc/a;->a(Ljava/lang/Float;Ljava/lang/Float;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p0, p1}, Loc/a;->a(Ljava/lang/Float;Ljava/lang/Float;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_1

    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    :cond_1
    return-object p0

    .line 64
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v1, "Cannot coerce value to an empty range: "

    .line 69
    .line 70
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const/16 p1, 0x2e

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p0
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
    .line 115
    .line 116
    .line 117
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

.method public static final n(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;
    .locals 8

    .line 1
    const-string v0, "annotationClass"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "methods"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lbd/e;

    .line 12
    .line 13
    const/16 v1, 0x1b

    .line 14
    .line 15
    invoke-direct {v0, v1, p1}, Lbd/e;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    new-instance v0, Lbd/i;

    .line 23
    .line 24
    const/16 v1, 0x11

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-direct {v0, v1, p0, p1, v2}, Lbd/i;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/4 v1, 0x1

    .line 39
    new-array v1, v1, [Ljava/lang/Class;

    .line 40
    .line 41
    aput-object p0, v1, v2

    .line 42
    .line 43
    new-instance v2, Ltc/d;

    .line 44
    .line 45
    move-object v3, p0

    .line 46
    move-object v4, p1

    .line 47
    move-object v7, p2

    .line 48
    invoke-direct/range {v2 .. v7}, Ltc/d;-><init>(Ljava/lang/Class;Ljava/util/Map;Lub/p;Lub/p;Ljava/util/List;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-string p1, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance"

    .line 56
    .line 57
    invoke-static {p0, p1}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object p0
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

.method public static o(Lrg/j;)Lqg/h;
    .locals 5

    .line 1
    iget-object v0, p0, Lrg/j;->f:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ".zip.001"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lqg/f;

    .line 16
    .line 17
    iget-object p0, p0, Lrg/j;->f:Ljava/io/File;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/io/InputStream;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lqg/g;

    .line 23
    .line 24
    invoke-static {p0}, Lnh/a;->k(Ljava/io/File;)[Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-direct {v1, p0, v2}, Lqg/g;-><init>(Ljava/io/File;[Ljava/io/File;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, v0, Lqg/f;->a:Lqg/g;

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_0
    new-instance v0, Lqg/l;

    .line 35
    .line 36
    iget-object v1, p0, Lrg/j;->f:Ljava/io/File;

    .line 37
    .line 38
    iget-boolean v2, p0, Lrg/j;->e:Z

    .line 39
    .line 40
    iget-object p0, p0, Lrg/j;->b:Lrg/c;

    .line 41
    .line 42
    iget p0, p0, Lrg/c;->o:I

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/io/InputStream;-><init>()V

    .line 45
    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    iput v3, v0, Lqg/l;->e:I

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    new-array v3, v3, [B

    .line 52
    .line 53
    iput-object v3, v0, Lqg/l;->f:[B

    .line 54
    .line 55
    new-instance v3, Ljava/io/RandomAccessFile;

    .line 56
    .line 57
    const-string v4, "r"

    .line 58
    .line 59
    invoke-direct {v3, v1, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iput-object v3, v0, Lqg/l;->a:Ljava/io/RandomAccessFile;

    .line 63
    .line 64
    iput-object v1, v0, Lqg/l;->b:Ljava/io/File;

    .line 65
    .line 66
    iput-boolean v2, v0, Lqg/l;->d:Z

    .line 67
    .line 68
    iput p0, v0, Lqg/l;->c:I

    .line 69
    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    iput p0, v0, Lqg/l;->e:I

    .line 73
    .line 74
    :cond_1
    return-object v0
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

.method public static p(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    sget-object v0, Lu3/s;->a:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v1, 0x1c

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lu3/r;->d:Ljava/util/ArrayList;

    .line 12
    .line 13
    const v0, 0x7f070097

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lu3/r;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    new-instance v1, Lu3/r;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v2, v1, Lu3/r;->a:Ljava/util/WeakHashMap;

    .line 31
    .line 32
    iput-object v2, v1, Lu3/r;->b:Landroid/util/SparseArray;

    .line 33
    .line 34
    iput-object v2, v1, Lu3/r;->c:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object p0, v1, Lu3/r;->c:Ljava/lang/ref/WeakReference;

    .line 40
    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-ne p0, p1, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object p0, v1, Lu3/r;->c:Ljava/lang/ref/WeakReference;

    .line 56
    .line 57
    iget-object p0, v1, Lu3/r;->b:Landroid/util/SparseArray;

    .line 58
    .line 59
    if-nez p0, :cond_3

    .line 60
    .line 61
    new-instance p0, Landroid/util/SparseArray;

    .line 62
    .line 63
    invoke-direct {p0}, Landroid/util/SparseArray;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p0, v1, Lu3/r;->b:Landroid/util/SparseArray;

    .line 67
    .line 68
    :cond_3
    iget-object p0, v1, Lu3/r;->b:Landroid/util/SparseArray;

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    const/4 v1, 0x1

    .line 75
    if-ne v0, v1, :cond_4

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-ltz v0, :cond_4

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->removeAt(I)V

    .line 94
    .line 95
    .line 96
    :cond_4
    if-nez v2, :cond_5

    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    move-object v2, p0

    .line 107
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 108
    .line 109
    :cond_5
    if-eqz v2, :cond_8

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, Landroid/view/View;

    .line 116
    .line 117
    if-eqz p0, :cond_7

    .line 118
    .line 119
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_7

    .line 124
    .line 125
    const p1, 0x7f070098

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    check-cast p0, Ljava/util/ArrayList;

    .line 133
    .line 134
    if-eqz p0, :cond_7

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    sub-int/2addr p1, v1

    .line 141
    if-gez p1, :cond_6

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_6
    invoke-static {p1, p0}, Lq/t0;->A(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    throw p0

    .line 149
    :cond_7
    :goto_0
    return v1

    .line 150
    :cond_8
    :goto_1
    const/4 p0, 0x0

    .line 151
    return p0
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

.method public static final q(FFF[F)[F
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, v0, p3}, Lnh/a;->i(II[F)F

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    mul-float v1, v1, p0

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-static {p3, v2, v0, p1, v1}, Lq/t0;->w([FIIFF)F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v3, 0x2

    .line 14
    invoke-static {p3, v3, v0, p2, v1}, Lq/t0;->w([FIIFF)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {v0, v2, p3}, Lnh/a;->i(II[F)F

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    mul-float v4, v4, p0

    .line 23
    .line 24
    invoke-static {p3, v2, v2, p1, v4}, Lq/t0;->w([FIIFF)F

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-static {p3, v3, v2, p2, v4}, Lq/t0;->w([FIIFF)F

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-static {v0, v3, p3}, Lnh/a;->i(II[F)F

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    mul-float v5, v5, p0

    .line 37
    .line 38
    invoke-static {p3, v2, v3, p1, v5}, Lq/t0;->w([FIIFF)F

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-static {p3, v3, v3, p2, p0}, Lq/t0;->w([FIIFF)F

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    const/4 p1, 0x3

    .line 47
    new-array p1, p1, [F

    .line 48
    .line 49
    aput v1, p1, v0

    .line 50
    .line 51
    aput v4, p1, v2

    .line 52
    .line 53
    aput p0, p1, v3

    .line 54
    .line 55
    return-object p1
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
    .line 115
    .line 116
    .line 117
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
.end method

.method public static final r(FFF[F)[F
    .locals 10

    .line 1
    const-string v0, "$this$dotDiagonal"

    .line 2
    .line 3
    invoke-static {p3, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {v0, v0, p3}, Lnh/a;->i(II[F)F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    mul-float v1, v1, p0

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-static {v2, v0, p3}, Lnh/a;->i(II[F)F

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    mul-float v3, v3, p1

    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    invoke-static {v4, v0, p3}, Lnh/a;->i(II[F)F

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    mul-float v5, v5, p2

    .line 26
    .line 27
    invoke-static {v0, v2, p3}, Lnh/a;->i(II[F)F

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    mul-float v6, v6, p0

    .line 32
    .line 33
    invoke-static {v2, v2, p3}, Lnh/a;->i(II[F)F

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    mul-float v7, v7, p1

    .line 38
    .line 39
    invoke-static {v4, v2, p3}, Lnh/a;->i(II[F)F

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    mul-float v8, v8, p2

    .line 44
    .line 45
    invoke-static {v0, v4, p3}, Lnh/a;->i(II[F)F

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    mul-float v9, v9, p0

    .line 50
    .line 51
    invoke-static {v2, v4, p3}, Lnh/a;->i(II[F)F

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    mul-float p0, p0, p1

    .line 56
    .line 57
    invoke-static {v4, v4, p3}, Lnh/a;->i(II[F)F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    mul-float p1, p1, p2

    .line 62
    .line 63
    const/16 p2, 0x9

    .line 64
    .line 65
    new-array p2, p2, [F

    .line 66
    .line 67
    aput v1, p2, v0

    .line 68
    .line 69
    aput v3, p2, v2

    .line 70
    .line 71
    aput v5, p2, v4

    .line 72
    .line 73
    const/4 p3, 0x3

    .line 74
    aput v6, p2, p3

    .line 75
    .line 76
    const/4 p3, 0x4

    .line 77
    aput v7, p2, p3

    .line 78
    .line 79
    const/4 p3, 0x5

    .line 80
    aput v8, p2, p3

    .line 81
    .line 82
    const/4 p3, 0x6

    .line 83
    aput v9, p2, p3

    .line 84
    .line 85
    const/4 p3, 0x7

    .line 86
    aput p0, p2, p3

    .line 87
    .line 88
    const/16 p0, 0x8

    .line 89
    .line 90
    aput p1, p2, p0

    .line 91
    .line 92
    return-object p2
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
    .line 115
    .line 116
    .line 117
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
.end method

.method public static final s(II[F[F)F
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p1, p2}, Lnh/a;->i(II[F)F

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-static {p0, v0, p3}, Lnh/a;->i(II[F)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    mul-float v0, v0, v1

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-static {v1, p1, p2}, Lnh/a;->i(II[F)F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {p3, p0, v1, v2, v0}, Lq/t0;->w([FIIFF)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x2

    .line 22
    invoke-static {v1, p1, p2}, Lnh/a;->i(II[F)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {p3, p0, v1, p1, v0}, Lq/t0;->w([FIIFF)F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
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
    .line 115
    .line 116
    .line 117
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
.end method

.method public static final t()Lw1/f;
    .locals 12

    .line 1
    sget-object v0, Lnh/b;->a:Lw1/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v1, Lw1/e;

    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    const/16 v11, 0x60

    .line 10
    .line 11
    const-string v2, "Filled.Add"

    .line 12
    .line 13
    const/high16 v3, 0x41c00000    # 24.0f

    .line 14
    .line 15
    const/high16 v4, 0x41c00000    # 24.0f

    .line 16
    .line 17
    const/high16 v5, 0x41c00000    # 24.0f

    .line 18
    .line 19
    const/high16 v6, 0x41c00000    # 24.0f

    .line 20
    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    const/4 v10, 0x0

    .line 24
    invoke-direct/range {v1 .. v11}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 25
    .line 26
    .line 27
    sget v0, Lw1/g0;->a:I

    .line 28
    .line 29
    new-instance v0, Lq1/n0;

    .line 30
    .line 31
    sget-wide v2, Lq1/q;->b:J

    .line 32
    .line 33
    invoke-direct {v0, v2, v3}, Lq1/n0;-><init>(J)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Lhd/q0;

    .line 37
    .line 38
    const/4 v3, 0x6

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-direct {v2, v4, v3}, Lhd/q0;-><init>(BI)V

    .line 41
    .line 42
    .line 43
    const/high16 v3, 0x41980000    # 19.0f

    .line 44
    .line 45
    const/high16 v5, 0x41500000    # 13.0f

    .line 46
    .line 47
    invoke-virtual {v2, v3, v5}, Lhd/q0;->u(FF)V

    .line 48
    .line 49
    .line 50
    const/high16 v3, -0x3f400000    # -6.0f

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Lhd/q0;->r(F)V

    .line 53
    .line 54
    .line 55
    const/high16 v5, 0x40c00000    # 6.0f

    .line 56
    .line 57
    invoke-virtual {v2, v5}, Lhd/q0;->z(F)V

    .line 58
    .line 59
    .line 60
    const/high16 v6, -0x40000000    # -2.0f

    .line 61
    .line 62
    invoke-virtual {v2, v6}, Lhd/q0;->r(F)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v3}, Lhd/q0;->z(F)V

    .line 66
    .line 67
    .line 68
    const/high16 v3, 0x40a00000    # 5.0f

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Lhd/q0;->q(F)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v6}, Lhd/q0;->z(F)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v5}, Lhd/q0;->r(F)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v3}, Lhd/q0;->y(F)V

    .line 80
    .line 81
    .line 82
    const/high16 v3, 0x40000000    # 2.0f

    .line 83
    .line 84
    invoke-virtual {v2, v3}, Lhd/q0;->r(F)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v5}, Lhd/q0;->z(F)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v5}, Lhd/q0;->r(F)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v3}, Lhd/q0;->z(F)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Lhd/q0;->l()V

    .line 97
    .line 98
    .line 99
    iget-object v2, v2, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-static {v1, v2, v4, v0}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Lw1/e;->b()Lw1/f;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    sput-object v0, Lnh/b;->a:Lw1/f;

    .line 109
    .line 110
    return-object v0
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public static final u()Lw1/f;
    .locals 12

    .line 1
    sget-object v0, Lnh/b;->b:Lw1/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v1, Lw1/e;

    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    const/16 v11, 0x60

    .line 10
    .line 11
    const-string v2, "Filled.ClearAll"

    .line 12
    .line 13
    const/high16 v3, 0x41c00000    # 24.0f

    .line 14
    .line 15
    const/high16 v4, 0x41c00000    # 24.0f

    .line 16
    .line 17
    const/high16 v5, 0x41c00000    # 24.0f

    .line 18
    .line 19
    const/high16 v6, 0x41c00000    # 24.0f

    .line 20
    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    const/4 v10, 0x0

    .line 24
    invoke-direct/range {v1 .. v11}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 25
    .line 26
    .line 27
    sget v0, Lw1/g0;->a:I

    .line 28
    .line 29
    new-instance v0, Lq1/n0;

    .line 30
    .line 31
    sget-wide v2, Lq1/q;->b:J

    .line 32
    .line 33
    invoke-direct {v0, v2, v3}, Lq1/n0;-><init>(J)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Lhd/q0;

    .line 37
    .line 38
    const/4 v3, 0x6

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-direct {v2, v4, v3}, Lhd/q0;-><init>(BI)V

    .line 41
    .line 42
    .line 43
    const/high16 v3, 0x41500000    # 13.0f

    .line 44
    .line 45
    const/high16 v5, 0x40a00000    # 5.0f

    .line 46
    .line 47
    invoke-virtual {v2, v5, v3}, Lhd/q0;->u(FF)V

    .line 48
    .line 49
    .line 50
    const/high16 v3, 0x41600000    # 14.0f

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Lhd/q0;->r(F)V

    .line 53
    .line 54
    .line 55
    const/high16 v6, -0x40000000    # -2.0f

    .line 56
    .line 57
    invoke-virtual {v2, v6}, Lhd/q0;->z(F)V

    .line 58
    .line 59
    .line 60
    const/high16 v7, 0x41300000    # 11.0f

    .line 61
    .line 62
    const/high16 v8, 0x40000000    # 2.0f

    .line 63
    .line 64
    invoke-static {v2, v5, v7, v8}, Lj2/h0;->t(Lhd/q0;FFF)V

    .line 65
    .line 66
    .line 67
    const/high16 v5, 0x41880000    # 17.0f

    .line 68
    .line 69
    const/high16 v7, 0x40400000    # 3.0f

    .line 70
    .line 71
    invoke-virtual {v2, v7, v5}, Lhd/q0;->u(FF)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v3}, Lhd/q0;->r(F)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v6}, Lhd/q0;->z(F)V

    .line 78
    .line 79
    .line 80
    const/high16 v5, 0x41700000    # 15.0f

    .line 81
    .line 82
    invoke-static {v2, v7, v5, v8}, Lj2/h0;->t(Lhd/q0;FFF)V

    .line 83
    .line 84
    .line 85
    const/high16 v5, 0x40e00000    # 7.0f

    .line 86
    .line 87
    invoke-virtual {v2, v5, v5}, Lhd/q0;->u(FF)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v8}, Lhd/q0;->z(F)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v3}, Lhd/q0;->r(F)V

    .line 94
    .line 95
    .line 96
    const/high16 v3, 0x41a80000    # 21.0f

    .line 97
    .line 98
    invoke-virtual {v2, v3, v5}, Lhd/q0;->s(FF)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v5, v5}, Lhd/q0;->s(FF)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Lhd/q0;->l()V

    .line 105
    .line 106
    .line 107
    iget-object v2, v2, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-static {v1, v2, v4, v0}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Lw1/e;->b()Lw1/f;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    sput-object v0, Lnh/b;->b:Lw1/f;

    .line 117
    .line 118
    return-object v0
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public static final v()Lw1/f;
    .locals 12

    .line 1
    sget-object v0, Lnh/b;->c:Lw1/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v1, Lw1/e;

    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    const/16 v11, 0x60

    .line 10
    .line 11
    const-string v2, "Filled.Delete"

    .line 12
    .line 13
    const/high16 v3, 0x41c00000    # 24.0f

    .line 14
    .line 15
    const/high16 v4, 0x41c00000    # 24.0f

    .line 16
    .line 17
    const/high16 v5, 0x41c00000    # 24.0f

    .line 18
    .line 19
    const/high16 v6, 0x41c00000    # 24.0f

    .line 20
    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    const/4 v10, 0x0

    .line 24
    invoke-direct/range {v1 .. v11}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 25
    .line 26
    .line 27
    sget v0, Lw1/g0;->a:I

    .line 28
    .line 29
    new-instance v0, Lq1/n0;

    .line 30
    .line 31
    sget-wide v2, Lq1/q;->b:J

    .line 32
    .line 33
    invoke-direct {v0, v2, v3}, Lq1/n0;-><init>(J)V

    .line 34
    .line 35
    .line 36
    const/high16 v2, 0x40c00000    # 6.0f

    .line 37
    .line 38
    const/high16 v3, 0x41980000    # 19.0f

    .line 39
    .line 40
    invoke-static {v2, v3}, Lj2/h0;->h(FF)Lhd/q0;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/high16 v9, 0x40000000    # 2.0f

    .line 45
    .line 46
    const/high16 v10, 0x40000000    # 2.0f

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    const v6, 0x3f8ccccd    # 1.1f

    .line 50
    .line 51
    .line 52
    const v7, 0x3f666666    # 0.9f

    .line 53
    .line 54
    .line 55
    const/high16 v8, 0x40000000    # 2.0f

    .line 56
    .line 57
    invoke-virtual/range {v4 .. v10}, Lhd/q0;->n(FFFFFF)V

    .line 58
    .line 59
    .line 60
    const/high16 v5, 0x41000000    # 8.0f

    .line 61
    .line 62
    invoke-virtual {v4, v5}, Lhd/q0;->r(F)V

    .line 63
    .line 64
    .line 65
    const/high16 v10, -0x40000000    # -2.0f

    .line 66
    .line 67
    const v5, 0x3f8ccccd    # 1.1f

    .line 68
    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    const/high16 v7, 0x40000000    # 2.0f

    .line 72
    .line 73
    const v8, -0x4099999a    # -0.9f

    .line 74
    .line 75
    .line 76
    invoke-virtual/range {v4 .. v10}, Lhd/q0;->n(FFFFFF)V

    .line 77
    .line 78
    .line 79
    const/high16 v5, 0x40e00000    # 7.0f

    .line 80
    .line 81
    invoke-virtual {v4, v5}, Lhd/q0;->y(F)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v2}, Lhd/q0;->q(F)V

    .line 85
    .line 86
    .line 87
    const/high16 v2, 0x41400000    # 12.0f

    .line 88
    .line 89
    invoke-virtual {v4, v2}, Lhd/q0;->z(F)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4}, Lhd/q0;->l()V

    .line 93
    .line 94
    .line 95
    const/high16 v2, 0x40800000    # 4.0f

    .line 96
    .line 97
    invoke-virtual {v4, v3, v2}, Lhd/q0;->u(FF)V

    .line 98
    .line 99
    .line 100
    const/high16 v3, -0x3fa00000    # -3.5f

    .line 101
    .line 102
    invoke-virtual {v4, v3}, Lhd/q0;->r(F)V

    .line 103
    .line 104
    .line 105
    const/high16 v3, -0x40800000    # -1.0f

    .line 106
    .line 107
    invoke-virtual {v4, v3, v3}, Lhd/q0;->t(FF)V

    .line 108
    .line 109
    .line 110
    const/high16 v5, -0x3f600000    # -5.0f

    .line 111
    .line 112
    invoke-virtual {v4, v5}, Lhd/q0;->r(F)V

    .line 113
    .line 114
    .line 115
    const/high16 v5, 0x3f800000    # 1.0f

    .line 116
    .line 117
    invoke-virtual {v4, v3, v5}, Lhd/q0;->t(FF)V

    .line 118
    .line 119
    .line 120
    const/high16 v3, 0x40a00000    # 5.0f

    .line 121
    .line 122
    invoke-virtual {v4, v3}, Lhd/q0;->q(F)V

    .line 123
    .line 124
    .line 125
    const/high16 v3, 0x40000000    # 2.0f

    .line 126
    .line 127
    invoke-virtual {v4, v3}, Lhd/q0;->z(F)V

    .line 128
    .line 129
    .line 130
    const/high16 v3, 0x41600000    # 14.0f

    .line 131
    .line 132
    invoke-virtual {v4, v3}, Lhd/q0;->r(F)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, v2}, Lhd/q0;->y(F)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4}, Lhd/q0;->l()V

    .line 139
    .line 140
    .line 141
    iget-object v2, v4, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 142
    .line 143
    const/4 v3, 0x0

    .line 144
    invoke-static {v1, v2, v3, v0}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Lw1/e;->b()Lw1/f;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sput-object v0, Lnh/b;->c:Lw1/f;

    .line 152
    .line 153
    return-object v0
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public static final w()Lw1/f;
    .locals 12

    .line 1
    sget-object v0, Lnh/b;->e:Lw1/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v1, Lw1/e;

    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    const/16 v11, 0x60

    .line 10
    .line 11
    const-string v2, "Filled.FolderSpecial"

    .line 12
    .line 13
    const/high16 v3, 0x41c00000    # 24.0f

    .line 14
    .line 15
    const/high16 v4, 0x41c00000    # 24.0f

    .line 16
    .line 17
    const/high16 v5, 0x41c00000    # 24.0f

    .line 18
    .line 19
    const/high16 v6, 0x41c00000    # 24.0f

    .line 20
    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    const/4 v10, 0x0

    .line 24
    invoke-direct/range {v1 .. v11}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 25
    .line 26
    .line 27
    sget v0, Lw1/g0;->a:I

    .line 28
    .line 29
    new-instance v0, Lq1/n0;

    .line 30
    .line 31
    sget-wide v2, Lq1/q;->b:J

    .line 32
    .line 33
    invoke-direct {v0, v2, v3}, Lq1/n0;-><init>(J)V

    .line 34
    .line 35
    .line 36
    new-instance v4, Lhd/q0;

    .line 37
    .line 38
    const/4 v2, 0x6

    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-direct {v4, v3, v2}, Lhd/q0;-><init>(BI)V

    .line 41
    .line 42
    .line 43
    const/high16 v2, 0x41a00000    # 20.0f

    .line 44
    .line 45
    const/high16 v5, 0x40c00000    # 6.0f

    .line 46
    .line 47
    invoke-virtual {v4, v2, v5}, Lhd/q0;->u(FF)V

    .line 48
    .line 49
    .line 50
    const/high16 v2, -0x3f000000    # -8.0f

    .line 51
    .line 52
    invoke-virtual {v4, v2}, Lhd/q0;->r(F)V

    .line 53
    .line 54
    .line 55
    const/high16 v2, -0x40000000    # -2.0f

    .line 56
    .line 57
    invoke-virtual {v4, v2, v2}, Lhd/q0;->t(FF)V

    .line 58
    .line 59
    .line 60
    const/high16 v2, 0x40800000    # 4.0f

    .line 61
    .line 62
    invoke-virtual {v4, v2, v2}, Lhd/q0;->s(FF)V

    .line 63
    .line 64
    .line 65
    const/high16 v9, -0x40000000    # -2.0f

    .line 66
    .line 67
    const/high16 v10, 0x40000000    # 2.0f

    .line 68
    .line 69
    const v5, -0x40733333    # -1.1f

    .line 70
    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    const/high16 v7, -0x40000000    # -2.0f

    .line 74
    .line 75
    const v8, 0x3f666666    # 0.9f

    .line 76
    .line 77
    .line 78
    invoke-virtual/range {v4 .. v10}, Lhd/q0;->n(FFFFFF)V

    .line 79
    .line 80
    .line 81
    const/high16 v2, 0x41400000    # 12.0f

    .line 82
    .line 83
    invoke-virtual {v4, v2}, Lhd/q0;->z(F)V

    .line 84
    .line 85
    .line 86
    const/high16 v9, 0x40000000    # 2.0f

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    const v6, 0x3f8ccccd    # 1.1f

    .line 90
    .line 91
    .line 92
    const v7, 0x3f666666    # 0.9f

    .line 93
    .line 94
    .line 95
    const/high16 v8, 0x40000000    # 2.0f

    .line 96
    .line 97
    invoke-virtual/range {v4 .. v10}, Lhd/q0;->n(FFFFFF)V

    .line 98
    .line 99
    .line 100
    const/high16 v2, 0x41800000    # 16.0f

    .line 101
    .line 102
    invoke-virtual {v4, v2}, Lhd/q0;->r(F)V

    .line 103
    .line 104
    .line 105
    const/high16 v10, -0x40000000    # -2.0f

    .line 106
    .line 107
    const v5, 0x3f8ccccd    # 1.1f

    .line 108
    .line 109
    .line 110
    const/4 v6, 0x0

    .line 111
    const/high16 v7, 0x40000000    # 2.0f

    .line 112
    .line 113
    const v8, -0x4099999a    # -0.9f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v4 .. v10}, Lhd/q0;->n(FFFFFF)V

    .line 117
    .line 118
    .line 119
    const/high16 v2, 0x41b00000    # 22.0f

    .line 120
    .line 121
    const/high16 v11, 0x41000000    # 8.0f

    .line 122
    .line 123
    invoke-virtual {v4, v2, v11}, Lhd/q0;->s(FF)V

    .line 124
    .line 125
    .line 126
    const/high16 v9, -0x40000000    # -2.0f

    .line 127
    .line 128
    const/4 v5, 0x0

    .line 129
    const v6, -0x40733333    # -1.1f

    .line 130
    .line 131
    .line 132
    const v7, -0x4099999a    # -0.9f

    .line 133
    .line 134
    .line 135
    const/high16 v8, -0x40000000    # -2.0f

    .line 136
    .line 137
    invoke-virtual/range {v4 .. v10}, Lhd/q0;->n(FFFFFF)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4}, Lhd/q0;->l()V

    .line 141
    .line 142
    .line 143
    const v2, 0x418f851f    # 17.94f

    .line 144
    .line 145
    .line 146
    const/high16 v5, 0x41880000    # 17.0f

    .line 147
    .line 148
    invoke-virtual {v4, v2, v5}, Lhd/q0;->u(FF)V

    .line 149
    .line 150
    .line 151
    const v2, 0x41747ae1    # 15.28f

    .line 152
    .line 153
    .line 154
    const/high16 v6, 0x41700000    # 15.0f

    .line 155
    .line 156
    invoke-virtual {v4, v6, v2}, Lhd/q0;->s(FF)V

    .line 157
    .line 158
    .line 159
    const v2, 0x4140f5c3    # 12.06f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4, v2, v5}, Lhd/q0;->s(FF)V

    .line 163
    .line 164
    .line 165
    const v2, -0x3faae148    # -3.33f

    .line 166
    .line 167
    .line 168
    const v5, 0x3f47ae14    # 0.78f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4, v5, v2}, Lhd/q0;->t(FF)V

    .line 172
    .line 173
    .line 174
    const v2, -0x3ff0a3d7    # -2.24f

    .line 175
    .line 176
    .line 177
    const v7, -0x3fda3d71    # -2.59f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4, v7, v2}, Lhd/q0;->t(FF)V

    .line 181
    .line 182
    .line 183
    const v2, -0x416b851f    # -0.29f

    .line 184
    .line 185
    .line 186
    const v8, 0x405a3d71    # 3.41f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4, v8, v2}, Lhd/q0;->t(FF)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4, v6, v11}, Lhd/q0;->s(FF)V

    .line 193
    .line 194
    .line 195
    const v2, 0x3fab851f    # 1.34f

    .line 196
    .line 197
    .line 198
    const v6, 0x4048f5c3    # 3.14f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4, v2, v6}, Lhd/q0;->t(FF)V

    .line 202
    .line 203
    .line 204
    const v2, 0x3e947ae1    # 0.29f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v4, v8, v2}, Lhd/q0;->t(FF)V

    .line 208
    .line 209
    .line 210
    const v2, 0x400f5c29    # 2.24f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v4, v7, v2}, Lhd/q0;->t(FF)V

    .line 214
    .line 215
    .line 216
    const v2, 0x40551eb8    # 3.33f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v4, v5, v2}, Lhd/q0;->t(FF)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v4}, Lhd/q0;->l()V

    .line 223
    .line 224
    .line 225
    iget-object v2, v4, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 226
    .line 227
    invoke-static {v1, v2, v3, v0}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1}, Lw1/e;->b()Lw1/f;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    sput-object v0, Lnh/b;->e:Lw1/f;

    .line 235
    .line 236
    return-object v0
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public static final x()Lw1/f;
    .locals 12

    .line 1
    sget-object v0, Lnh/b;->j:Lw1/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v1, Lw1/e;

    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    const/16 v11, 0x60

    .line 10
    .line 11
    const-string v2, "Filled.Replay"

    .line 12
    .line 13
    const/high16 v3, 0x41c00000    # 24.0f

    .line 14
    .line 15
    const/high16 v4, 0x41c00000    # 24.0f

    .line 16
    .line 17
    const/high16 v5, 0x41c00000    # 24.0f

    .line 18
    .line 19
    const/high16 v6, 0x41c00000    # 24.0f

    .line 20
    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    const/4 v10, 0x0

    .line 24
    invoke-direct/range {v1 .. v11}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 25
    .line 26
    .line 27
    sget v0, Lw1/g0;->a:I

    .line 28
    .line 29
    new-instance v0, Lq1/n0;

    .line 30
    .line 31
    sget-wide v2, Lq1/q;->b:J

    .line 32
    .line 33
    invoke-direct {v0, v2, v3}, Lq1/n0;-><init>(J)V

    .line 34
    .line 35
    .line 36
    new-instance v4, Lhd/q0;

    .line 37
    .line 38
    const/4 v2, 0x6

    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-direct {v4, v3, v2}, Lhd/q0;-><init>(BI)V

    .line 41
    .line 42
    .line 43
    const/high16 v2, 0x41400000    # 12.0f

    .line 44
    .line 45
    const/high16 v5, 0x40a00000    # 5.0f

    .line 46
    .line 47
    invoke-virtual {v4, v2, v5}, Lhd/q0;->u(FF)V

    .line 48
    .line 49
    .line 50
    const/high16 v2, 0x3f800000    # 1.0f

    .line 51
    .line 52
    invoke-virtual {v4, v2}, Lhd/q0;->y(F)V

    .line 53
    .line 54
    .line 55
    const/high16 v2, 0x40e00000    # 7.0f

    .line 56
    .line 57
    const/high16 v11, 0x40c00000    # 6.0f

    .line 58
    .line 59
    invoke-virtual {v4, v2, v11}, Lhd/q0;->s(FF)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v5, v5}, Lhd/q0;->t(FF)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v2}, Lhd/q0;->y(F)V

    .line 66
    .line 67
    .line 68
    const/high16 v9, 0x40c00000    # 6.0f

    .line 69
    .line 70
    const/high16 v10, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const v5, 0x4053d70a    # 3.31f

    .line 73
    .line 74
    .line 75
    const/4 v6, 0x0

    .line 76
    const/high16 v7, 0x40c00000    # 6.0f

    .line 77
    .line 78
    const v8, 0x402c28f6    # 2.69f

    .line 79
    .line 80
    .line 81
    invoke-virtual/range {v4 .. v10}, Lhd/q0;->n(FFFFFF)V

    .line 82
    .line 83
    .line 84
    const v2, -0x3fd3d70a    # -2.69f

    .line 85
    .line 86
    .line 87
    const/high16 v5, -0x3f400000    # -6.0f

    .line 88
    .line 89
    invoke-virtual {v4, v2, v11, v5, v11}, Lhd/q0;->w(FFFF)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v5, v2, v5, v5}, Lhd/q0;->w(FFFF)V

    .line 93
    .line 94
    .line 95
    const/high16 v2, 0x40800000    # 4.0f

    .line 96
    .line 97
    invoke-virtual {v4, v2}, Lhd/q0;->q(F)V

    .line 98
    .line 99
    .line 100
    const/high16 v9, 0x41000000    # 8.0f

    .line 101
    .line 102
    const/high16 v10, 0x41000000    # 8.0f

    .line 103
    .line 104
    const/4 v5, 0x0

    .line 105
    const v6, 0x408d70a4    # 4.42f

    .line 106
    .line 107
    .line 108
    const v7, 0x40651eb8    # 3.58f

    .line 109
    .line 110
    .line 111
    const/high16 v8, 0x41000000    # 8.0f

    .line 112
    .line 113
    invoke-virtual/range {v4 .. v10}, Lhd/q0;->n(FFFFFF)V

    .line 114
    .line 115
    .line 116
    const/high16 v2, 0x41000000    # 8.0f

    .line 117
    .line 118
    const v5, -0x3f9ae148    # -3.58f

    .line 119
    .line 120
    .line 121
    const/high16 v6, -0x3f000000    # -8.0f

    .line 122
    .line 123
    invoke-virtual {v4, v2, v5, v2, v6}, Lhd/q0;->w(FFFF)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4, v5, v6, v6, v6}, Lhd/q0;->w(FFFF)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4}, Lhd/q0;->l()V

    .line 130
    .line 131
    .line 132
    iget-object v2, v4, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-static {v1, v2, v3, v0}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Lw1/e;->b()Lw1/f;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    sput-object v0, Lnh/b;->j:Lw1/f;

    .line 142
    .line 143
    return-object v0
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public static final y(Lpc/f;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    invoke-interface {p0}, Lpc/b;->o()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Iterable;

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    move-object v2, v1

    .line 27
    check-cast v2, Lpc/n;

    .line 28
    .line 29
    check-cast v2, Lsc/a1;

    .line 30
    .line 31
    iget-object v2, v2, Lsc/a1;->c:Lpc/m;

    .line 32
    .line 33
    sget-object v3, Lpc/m;->d:Lpc/m;

    .line 34
    .line 35
    if-ne v2, v3, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object v0
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
.end method

.method public static z([F)[F
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v1, v0}, Lnh/a;->i(II[F)F

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    float-to-double v2, v2

    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-static {v4, v1, v0}, Lnh/a;->i(II[F)F

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    float-to-double v5, v5

    .line 15
    const/4 v7, 0x2

    .line 16
    invoke-static {v7, v1, v0}, Lnh/a;->i(II[F)F

    .line 17
    .line 18
    .line 19
    move-result v8

    .line 20
    float-to-double v8, v8

    .line 21
    invoke-static {v1, v4, v0}, Lnh/a;->i(II[F)F

    .line 22
    .line 23
    .line 24
    move-result v10

    .line 25
    float-to-double v10, v10

    .line 26
    invoke-static {v4, v4, v0}, Lnh/a;->i(II[F)F

    .line 27
    .line 28
    .line 29
    move-result v12

    .line 30
    float-to-double v12, v12

    .line 31
    invoke-static {v7, v4, v0}, Lnh/a;->i(II[F)F

    .line 32
    .line 33
    .line 34
    move-result v14

    .line 35
    float-to-double v14, v14

    .line 36
    move-wide/from16 v16, v2

    .line 37
    .line 38
    invoke-static {v1, v7, v0}, Lnh/a;->i(II[F)F

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    float-to-double v2, v2

    .line 43
    const/16 v18, 0x0

    .line 44
    .line 45
    invoke-static {v4, v7, v0}, Lnh/a;->i(II[F)F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    move-wide/from16 v20, v5

    .line 50
    .line 51
    const/16 v19, 0x1

    .line 52
    .line 53
    float-to-double v4, v1

    .line 54
    invoke-static {v7, v7, v0}, Lnh/a;->i(II[F)F

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    move-wide/from16 v22, v8

    .line 59
    .line 60
    const/4 v6, 0x2

    .line 61
    float-to-double v7, v1

    .line 62
    mul-double v24, v12, v7

    .line 63
    .line 64
    mul-double v26, v4, v14

    .line 65
    .line 66
    sub-double v24, v24, v26

    .line 67
    .line 68
    mul-double v26, v4, v22

    .line 69
    .line 70
    mul-double v28, v20, v7

    .line 71
    .line 72
    sub-double v26, v26, v28

    .line 73
    .line 74
    mul-double v28, v20, v14

    .line 75
    .line 76
    mul-double v30, v12, v22

    .line 77
    .line 78
    sub-double v28, v28, v30

    .line 79
    .line 80
    mul-double v30, v16, v24

    .line 81
    .line 82
    mul-double v32, v10, v26

    .line 83
    .line 84
    add-double v32, v32, v30

    .line 85
    .line 86
    mul-double v30, v2, v28

    .line 87
    .line 88
    add-double v30, v30, v32

    .line 89
    .line 90
    array-length v1, v0

    .line 91
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-string v1, "copyOf(this, size)"

    .line 96
    .line 97
    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    move-wide/from16 v32, v7

    .line 101
    .line 102
    const/4 v1, 0x2

    .line 103
    div-double v6, v24, v30

    .line 104
    .line 105
    double-to-float v6, v6

    .line 106
    aput v6, v0, v18

    .line 107
    .line 108
    mul-double v6, v2, v14

    .line 109
    .line 110
    mul-double v8, v10, v32

    .line 111
    .line 112
    sub-double/2addr v6, v8

    .line 113
    div-double v6, v6, v30

    .line 114
    .line 115
    double-to-float v6, v6

    .line 116
    const/4 v7, 0x3

    .line 117
    aput v6, v0, v7

    .line 118
    .line 119
    mul-double v6, v10, v4

    .line 120
    .line 121
    mul-double v8, v2, v12

    .line 122
    .line 123
    sub-double/2addr v6, v8

    .line 124
    div-double v6, v6, v30

    .line 125
    .line 126
    double-to-float v6, v6

    .line 127
    const/4 v7, 0x6

    .line 128
    aput v6, v0, v7

    .line 129
    .line 130
    div-double v6, v26, v30

    .line 131
    .line 132
    double-to-float v6, v6

    .line 133
    aput v6, v0, v19

    .line 134
    .line 135
    mul-double v6, v16, v32

    .line 136
    .line 137
    mul-double v8, v2, v22

    .line 138
    .line 139
    sub-double/2addr v6, v8

    .line 140
    div-double v6, v6, v30

    .line 141
    .line 142
    double-to-float v6, v6

    .line 143
    const/4 v7, 0x4

    .line 144
    aput v6, v0, v7

    .line 145
    .line 146
    mul-double v2, v2, v20

    .line 147
    .line 148
    mul-double v4, v4, v16

    .line 149
    .line 150
    sub-double/2addr v2, v4

    .line 151
    div-double v2, v2, v30

    .line 152
    .line 153
    double-to-float v2, v2

    .line 154
    const/4 v3, 0x7

    .line 155
    aput v2, v0, v3

    .line 156
    .line 157
    div-double v2, v28, v30

    .line 158
    .line 159
    double-to-float v2, v2

    .line 160
    aput v2, v0, v1

    .line 161
    .line 162
    mul-double v8, v10, v22

    .line 163
    .line 164
    mul-double v2, v16, v14

    .line 165
    .line 166
    sub-double/2addr v8, v2

    .line 167
    div-double v8, v8, v30

    .line 168
    .line 169
    double-to-float v1, v8

    .line 170
    const/4 v2, 0x5

    .line 171
    aput v1, v0, v2

    .line 172
    .line 173
    mul-double v2, v16, v12

    .line 174
    .line 175
    mul-double v10, v10, v20

    .line 176
    .line 177
    sub-double/2addr v2, v10

    .line 178
    div-double v2, v2, v30

    .line 179
    .line 180
    double-to-float v1, v2

    .line 181
    const/16 v2, 0x8

    .line 182
    .line 183
    aput v1, v0, v2

    .line 184
    .line 185
    return-object v0
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method
