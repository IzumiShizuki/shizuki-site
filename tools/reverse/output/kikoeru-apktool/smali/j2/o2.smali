.class public final Lj2/o2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Li2/o1;


# instance fields
.field public final a:Lj2/v;

.field public b:Lic/n;

.field public c:Lic/a;

.field public d:Z

.field public final e:Lj2/e2;

.field public f:Z

.field public g:Z

.field public h:Lp4/p;

.field public final i:Lc2/d;

.field public final j:Lq1/p;

.field public k:J

.field public final l:Lj2/o1;

.field public m:I


# direct methods
.method public constructor <init>(Lj2/v;Lic/n;Lic/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj2/o2;->a:Lj2/v;

    .line 5
    .line 6
    iput-object p2, p0, Lj2/o2;->b:Lic/n;

    .line 7
    .line 8
    iput-object p3, p0, Lj2/o2;->c:Lic/a;

    .line 9
    .line 10
    new-instance p2, Lj2/e2;

    .line 11
    .line 12
    invoke-direct {p2}, Lj2/e2;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lj2/o2;->e:Lj2/e2;

    .line 16
    .line 17
    new-instance p2, Lc2/d;

    .line 18
    .line 19
    sget-object p3, Lj2/i1;->d:Lj2/i1;

    .line 20
    .line 21
    invoke-direct {p2, p3}, Lc2/d;-><init>(Lic/n;)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lj2/o2;->i:Lc2/d;

    .line 25
    .line 26
    new-instance p2, Lq1/p;

    .line 27
    .line 28
    invoke-direct {p2}, Lq1/p;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p2, p0, Lj2/o2;->j:Lq1/p;

    .line 32
    .line 33
    sget-wide p2, Lq1/p0;->b:J

    .line 34
    .line 35
    iput-wide p2, p0, Lj2/o2;->k:J

    .line 36
    .line 37
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 p3, 0x1d

    .line 40
    .line 41
    if-lt p2, p3, :cond_0

    .line 42
    .line 43
    new-instance p1, Lj2/m2;

    .line 44
    .line 45
    invoke-direct {p1}, Lj2/m2;-><init>()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p2, Lj2/k2;

    .line 50
    .line 51
    invoke-direct {p2, p1}, Lj2/k2;-><init>(Lj2/v;)V

    .line 52
    .line 53
    .line 54
    move-object p1, p2

    .line 55
    :goto_0
    invoke-interface {p1}, Lj2/o1;->D()Z

    .line 56
    .line 57
    .line 58
    const/4 p2, 0x0

    .line 59
    invoke-interface {p1, p2}, Lj2/o1;->w(Z)V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lj2/o2;->l:Lj2/o1;

    .line 63
    .line 64
    return-void
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


# virtual methods
.method public final a([F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj2/o2;->i:Lc2/d;

    .line 2
    .line 3
    iget-object v1, p0, Lj2/o2;->l:Lj2/o1;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lc2/d;->c(Ljava/lang/Object;)[F

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p1, v0}, Lq1/a0;->e([F[F)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public final b(Lq1/o;Lt1/b;)V
    .locals 8

    .line 1
    invoke-static {p1}, Lq1/c;->a(Lq1/o;)Landroid/graphics/Canvas;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/4 v6, 0x0

    .line 10
    iget-object v7, p0, Lj2/o2;->l:Lj2/o1;

    .line 11
    .line 12
    if-eqz p2, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Lj2/o2;->j()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v7}, Lj2/o1;->N()F

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    const/4 v1, 0x0

    .line 22
    cmpl-float p2, p2, v1

    .line 23
    .line 24
    if-lez p2, :cond_0

    .line 25
    .line 26
    const/4 v6, 0x1

    .line 27
    :cond_0
    iput-boolean v6, p0, Lj2/o2;->g:Z

    .line 28
    .line 29
    if-eqz v6, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Lq1/o;->u()V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-interface {v7, v0}, Lj2/o1;->t(Landroid/graphics/Canvas;)V

    .line 35
    .line 36
    .line 37
    iget-boolean p2, p0, Lj2/o2;->g:Z

    .line 38
    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    invoke-interface {p1}, Lq1/o;->h()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-void

    .line 45
    :cond_3
    invoke-interface {v7}, Lj2/o1;->u()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    int-to-float v1, p2

    .line 50
    invoke-interface {v7}, Lj2/o1;->F()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    int-to-float v2, p2

    .line 55
    invoke-interface {v7}, Lj2/o1;->I()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    int-to-float v3, p2

    .line 60
    invoke-interface {v7}, Lj2/o1;->r()I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    int-to-float v4, p2

    .line 65
    invoke-interface {v7}, Lj2/o1;->a()F

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    const/high16 v5, 0x3f800000    # 1.0f

    .line 70
    .line 71
    cmpg-float p2, p2, v5

    .line 72
    .line 73
    if-gez p2, :cond_5

    .line 74
    .line 75
    iget-object p2, p0, Lj2/o2;->h:Lp4/p;

    .line 76
    .line 77
    if-nez p2, :cond_4

    .line 78
    .line 79
    invoke-static {}, Lq1/h0;->h()Lp4/p;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    iput-object p2, p0, Lj2/o2;->h:Lp4/p;

    .line 84
    .line 85
    :cond_4
    invoke-interface {v7}, Lj2/o1;->a()F

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    invoke-virtual {p2, v5}, Lp4/p;->g(F)V

    .line 90
    .line 91
    .line 92
    iget-object p2, p2, Lp4/p;->b:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v5, p2

    .line 95
    check-cast v5, Landroid/graphics/Paint;

    .line 96
    .line 97
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_5
    invoke-interface {p1}, Lq1/o;->f()V

    .line 102
    .line 103
    .line 104
    :goto_0
    invoke-interface {p1, v1, v2}, Lq1/o;->p(FF)V

    .line 105
    .line 106
    .line 107
    iget-object p2, p0, Lj2/o2;->i:Lc2/d;

    .line 108
    .line 109
    invoke-virtual {p2, v7}, Lc2/d;->c(Ljava/lang/Object;)[F

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-interface {p1, p2}, Lq1/o;->k([F)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v7}, Lj2/o1;->J()Z

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    if-nez p2, :cond_6

    .line 121
    .line 122
    invoke-interface {v7}, Lj2/o1;->E()Z

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    if-eqz p2, :cond_7

    .line 127
    .line 128
    :cond_6
    iget-object p2, p0, Lj2/o2;->e:Lj2/e2;

    .line 129
    .line 130
    invoke-virtual {p2, p1}, Lj2/e2;->a(Lq1/o;)V

    .line 131
    .line 132
    .line 133
    :cond_7
    iget-object p2, p0, Lj2/o2;->b:Lic/n;

    .line 134
    .line 135
    if-eqz p2, :cond_8

    .line 136
    .line 137
    const/4 v0, 0x0

    .line 138
    invoke-interface {p2, p1, v0}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    :cond_8
    invoke-interface {p1}, Lq1/o;->r()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v6}, Lj2/o2;->l(Z)V

    .line 145
    .line 146
    .line 147
    return-void
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

.method public final c(J)Z
    .locals 4

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p1, v0

    .line 4
    .line 5
    long-to-int v1, v0

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-wide v1, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long/2addr v1, p1

    .line 16
    long-to-int v2, v1

    .line 17
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, Lj2/o2;->l:Lj2/o1;

    .line 22
    .line 23
    invoke-interface {v2}, Lj2/o1;->E()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    cmpg-float p2, p1, v0

    .line 31
    .line 32
    if-gtz p2, :cond_0

    .line 33
    .line 34
    invoke-interface {v2}, Lj2/o1;->h()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    int-to-float p2, p2

    .line 39
    cmpg-float p2, v0, p2

    .line 40
    .line 41
    if-gez p2, :cond_0

    .line 42
    .line 43
    cmpg-float p1, p1, v1

    .line 44
    .line 45
    if-gtz p1, :cond_0

    .line 46
    .line 47
    invoke-interface {v2}, Lj2/o1;->b()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    int-to-float p1, p1

    .line 52
    cmpg-float p1, v1, p1

    .line 53
    .line 54
    if-gez p1, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/4 p1, 0x0

    .line 58
    return p1

    .line 59
    :cond_1
    invoke-interface {v2}, Lj2/o1;->J()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    iget-object v0, p0, Lj2/o2;->e:Lj2/e2;

    .line 66
    .line 67
    invoke-virtual {v0, p1, p2}, Lj2/e2;->c(J)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    return p1

    .line 72
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 73
    return p1
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

.method public final d(JZ)J
    .locals 2

    .line 1
    iget-object v0, p0, Lj2/o2;->l:Lj2/o1;

    .line 2
    .line 3
    iget-object v1, p0, Lj2/o2;->i:Lc2/d;

    .line 4
    .line 5
    if-eqz p3, :cond_1

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lc2/d;->b(Ljava/lang/Object;)[F

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    if-nez p3, :cond_0

    .line 12
    .line 13
    const-wide p1, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    return-wide p1

    .line 19
    :cond_0
    iget-boolean v0, v1, Lc2/d;->d:Z

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    invoke-static {p1, p2, p3}, Lq1/a0;->b(J[F)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    return-wide p1

    .line 28
    :cond_1
    invoke-virtual {v1, v0}, Lc2/d;->c(Ljava/lang/Object;)[F

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    iget-boolean v0, v1, Lc2/d;->d:Z

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    invoke-static {p1, p2, p3}, Lq1/a0;->b(J[F)J

    .line 37
    .line 38
    .line 39
    move-result-wide p1

    .line 40
    :cond_2
    return-wide p1
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

.method public final destroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lj2/o2;->l:Lj2/o1;

    .line 2
    .line 3
    invoke-interface {v0}, Lj2/o1;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lj2/o1;->f()V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lj2/o2;->b:Lic/n;

    .line 14
    .line 15
    iput-object v0, p0, Lj2/o2;->c:Lic/a;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lj2/o2;->f:Z

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p0, v1}, Lj2/o2;->l(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lj2/o2;->a:Lj2/v;

    .line 25
    .line 26
    iput-boolean v0, v1, Lj2/v;->G:Z

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Lj2/v;->I(Li2/o1;)Z

    .line 29
    .line 30
    .line 31
    return-void
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
.end method

.method public final e(J)V
    .locals 4

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p1, v0

    .line 4
    .line 5
    long-to-int v1, v0

    .line 6
    const-wide v2, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr p1, v2

    .line 12
    long-to-int p2, p1

    .line 13
    iget-wide v2, p0, Lj2/o2;->k:J

    .line 14
    .line 15
    invoke-static {v2, v3}, Lq1/p0;->b(J)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    int-to-float v0, v1

    .line 20
    mul-float p1, p1, v0

    .line 21
    .line 22
    iget-object v0, p0, Lj2/o2;->l:Lj2/o1;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Lj2/o1;->v(F)V

    .line 25
    .line 26
    .line 27
    iget-wide v2, p0, Lj2/o2;->k:J

    .line 28
    .line 29
    invoke-static {v2, v3}, Lq1/p0;->c(J)F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    int-to-float v2, p2

    .line 34
    mul-float p1, p1, v2

    .line 35
    .line 36
    invoke-interface {v0, p1}, Lj2/o1;->y(F)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0}, Lj2/o1;->u()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-interface {v0}, Lj2/o1;->F()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-interface {v0}, Lj2/o1;->u()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    add-int/2addr v3, v1

    .line 52
    invoke-interface {v0}, Lj2/o1;->F()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/2addr v1, p2

    .line 57
    invoke-interface {v0, p1, v2, v3, v1}, Lj2/o1;->x(IIII)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    iget-object p1, p0, Lj2/o2;->e:Lj2/e2;

    .line 64
    .line 65
    invoke-virtual {p1}, Lj2/e2;->b()Landroid/graphics/Outline;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {v0, p1}, Lj2/o1;->C(Landroid/graphics/Outline;)V

    .line 70
    .line 71
    .line 72
    iget-boolean p1, p0, Lj2/o2;->d:Z

    .line 73
    .line 74
    if-nez p1, :cond_0

    .line 75
    .line 76
    iget-boolean p1, p0, Lj2/o2;->f:Z

    .line 77
    .line 78
    if-nez p1, :cond_0

    .line 79
    .line 80
    iget-object p1, p0, Lj2/o2;->a:Lj2/v;

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 83
    .line 84
    .line 85
    const/4 p1, 0x1

    .line 86
    invoke-virtual {p0, p1}, Lj2/o2;->l(Z)V

    .line 87
    .line 88
    .line 89
    :cond_0
    iget-object p1, p0, Lj2/o2;->i:Lc2/d;

    .line 90
    .line 91
    invoke-virtual {p1}, Lc2/d;->e()V

    .line 92
    .line 93
    .line 94
    :cond_1
    return-void
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

.method public final f(Lic/n;Lic/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lj2/o2;->i:Lc2/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lc2/d;->a:Z

    .line 5
    .line 6
    iput-boolean v1, v0, Lc2/d;->b:Z

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    iput-boolean v2, v0, Lc2/d;->d:Z

    .line 10
    .line 11
    iput-boolean v2, v0, Lc2/d;->c:Z

    .line 12
    .line 13
    iget-object v2, v0, Lc2/d;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, [F

    .line 16
    .line 17
    invoke-static {v2}, Lq1/a0;->d([F)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Lc2/d;->h:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, [F

    .line 23
    .line 24
    invoke-static {v0}, Lq1/a0;->d([F)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1}, Lj2/o2;->l(Z)V

    .line 28
    .line 29
    .line 30
    iput-boolean v1, p0, Lj2/o2;->f:Z

    .line 31
    .line 32
    iput-boolean v1, p0, Lj2/o2;->g:Z

    .line 33
    .line 34
    sget-wide v0, Lq1/p0;->b:J

    .line 35
    .line 36
    iput-wide v0, p0, Lj2/o2;->k:J

    .line 37
    .line 38
    iput-object p1, p0, Lj2/o2;->b:Lic/n;

    .line 39
    .line 40
    iput-object p2, p0, Lj2/o2;->c:Lic/a;

    .line 41
    .line 42
    return-void
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

.method public final g([F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj2/o2;->i:Lc2/d;

    .line 2
    .line 3
    iget-object v1, p0, Lj2/o2;->l:Lj2/o1;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lc2/d;->b(Ljava/lang/Object;)[F

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p1, v0}, Lq1/a0;->e([F[F)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
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

.method public final getUnderlyingMatrix-sQKQjiQ()[F
    .locals 2

    .line 1
    iget-object v0, p0, Lj2/o2;->i:Lc2/d;

    .line 2
    .line 3
    iget-object v1, p0, Lj2/o2;->l:Lj2/o1;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lc2/d;->c(Ljava/lang/Object;)[F

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public final h(Lq1/i0;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v1, Lq1/i0;->a:I

    .line 6
    .line 7
    iget v3, v0, Lj2/o2;->m:I

    .line 8
    .line 9
    or-int/2addr v2, v3

    .line 10
    and-int/lit16 v3, v2, 0x1000

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    iget-wide v4, v1, Lq1/i0;->l:J

    .line 15
    .line 16
    iput-wide v4, v0, Lj2/o2;->k:J

    .line 17
    .line 18
    :cond_0
    iget-object v4, v0, Lj2/o2;->l:Lj2/o1;

    .line 19
    .line 20
    invoke-interface {v4}, Lj2/o1;->J()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    iget-object v6, v0, Lj2/o2;->e:Lj2/e2;

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v8, 0x1

    .line 28
    if-eqz v5, :cond_1

    .line 29
    .line 30
    iget-boolean v5, v6, Lj2/e2;->g:Z

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v5, 0x0

    .line 37
    :goto_0
    and-int/lit8 v9, v2, 0x1

    .line 38
    .line 39
    if-eqz v9, :cond_2

    .line 40
    .line 41
    iget v9, v1, Lq1/i0;->b:F

    .line 42
    .line 43
    invoke-interface {v4, v9}, Lj2/o1;->n(F)V

    .line 44
    .line 45
    .line 46
    :cond_2
    and-int/lit8 v9, v2, 0x2

    .line 47
    .line 48
    if-eqz v9, :cond_3

    .line 49
    .line 50
    iget v9, v1, Lq1/i0;->c:F

    .line 51
    .line 52
    invoke-interface {v4, v9}, Lj2/o1;->g(F)V

    .line 53
    .line 54
    .line 55
    :cond_3
    and-int/lit8 v9, v2, 0x4

    .line 56
    .line 57
    if-eqz v9, :cond_4

    .line 58
    .line 59
    iget v9, v1, Lq1/i0;->d:F

    .line 60
    .line 61
    invoke-interface {v4, v9}, Lj2/o1;->k(F)V

    .line 62
    .line 63
    .line 64
    :cond_4
    and-int/lit8 v9, v2, 0x8

    .line 65
    .line 66
    if-eqz v9, :cond_5

    .line 67
    .line 68
    iget v9, v1, Lq1/i0;->e:F

    .line 69
    .line 70
    invoke-interface {v4, v9}, Lj2/o1;->o(F)V

    .line 71
    .line 72
    .line 73
    :cond_5
    and-int/lit8 v9, v2, 0x10

    .line 74
    .line 75
    if-eqz v9, :cond_6

    .line 76
    .line 77
    iget v9, v1, Lq1/i0;->f:F

    .line 78
    .line 79
    invoke-interface {v4, v9}, Lj2/o1;->d(F)V

    .line 80
    .line 81
    .line 82
    :cond_6
    and-int/lit8 v9, v2, 0x20

    .line 83
    .line 84
    if-eqz v9, :cond_7

    .line 85
    .line 86
    iget v9, v1, Lq1/i0;->g:F

    .line 87
    .line 88
    invoke-interface {v4, v9}, Lj2/o1;->z(F)V

    .line 89
    .line 90
    .line 91
    :cond_7
    and-int/lit8 v9, v2, 0x40

    .line 92
    .line 93
    if-eqz v9, :cond_8

    .line 94
    .line 95
    iget-wide v9, v1, Lq1/i0;->h:J

    .line 96
    .line 97
    invoke-static {v9, v10}, Lq1/h0;->B(J)I

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    invoke-interface {v4, v9}, Lj2/o1;->H(I)V

    .line 102
    .line 103
    .line 104
    :cond_8
    and-int/lit16 v9, v2, 0x80

    .line 105
    .line 106
    if-eqz v9, :cond_9

    .line 107
    .line 108
    iget-wide v9, v1, Lq1/i0;->i:J

    .line 109
    .line 110
    invoke-static {v9, v10}, Lq1/h0;->B(J)I

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    invoke-interface {v4, v9}, Lj2/o1;->L(I)V

    .line 115
    .line 116
    .line 117
    :cond_9
    and-int/lit16 v9, v2, 0x400

    .line 118
    .line 119
    if-eqz v9, :cond_a

    .line 120
    .line 121
    iget v9, v1, Lq1/i0;->j:F

    .line 122
    .line 123
    invoke-interface {v4, v9}, Lj2/o1;->c(F)V

    .line 124
    .line 125
    .line 126
    :cond_a
    and-int/lit16 v9, v2, 0x100

    .line 127
    .line 128
    if-eqz v9, :cond_b

    .line 129
    .line 130
    invoke-interface {v4}, Lj2/o1;->j()V

    .line 131
    .line 132
    .line 133
    :cond_b
    and-int/lit16 v9, v2, 0x200

    .line 134
    .line 135
    if-eqz v9, :cond_c

    .line 136
    .line 137
    invoke-interface {v4}, Lj2/o1;->l()V

    .line 138
    .line 139
    .line 140
    :cond_c
    and-int/lit16 v9, v2, 0x800

    .line 141
    .line 142
    if-eqz v9, :cond_d

    .line 143
    .line 144
    iget v9, v1, Lq1/i0;->k:F

    .line 145
    .line 146
    invoke-interface {v4, v9}, Lj2/o1;->p(F)V

    .line 147
    .line 148
    .line 149
    :cond_d
    if-eqz v3, :cond_e

    .line 150
    .line 151
    iget-wide v9, v0, Lj2/o2;->k:J

    .line 152
    .line 153
    invoke-static {v9, v10}, Lq1/p0;->b(J)F

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    invoke-interface {v4}, Lj2/o1;->h()I

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    int-to-float v9, v9

    .line 162
    mul-float v3, v3, v9

    .line 163
    .line 164
    invoke-interface {v4, v3}, Lj2/o1;->v(F)V

    .line 165
    .line 166
    .line 167
    iget-wide v9, v0, Lj2/o2;->k:J

    .line 168
    .line 169
    invoke-static {v9, v10}, Lq1/p0;->c(J)F

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    invoke-interface {v4}, Lj2/o1;->b()I

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    int-to-float v9, v9

    .line 178
    mul-float v3, v3, v9

    .line 179
    .line 180
    invoke-interface {v4, v3}, Lj2/o1;->y(F)V

    .line 181
    .line 182
    .line 183
    :cond_e
    iget-boolean v3, v1, Lq1/i0;->n:Z

    .line 184
    .line 185
    sget-object v9, Lq1/h0;->a:Lq1/g0;

    .line 186
    .line 187
    if-eqz v3, :cond_f

    .line 188
    .line 189
    iget-object v3, v1, Lq1/i0;->m:Lq1/l0;

    .line 190
    .line 191
    if-eq v3, v9, :cond_f

    .line 192
    .line 193
    const/4 v13, 0x1

    .line 194
    goto :goto_1

    .line 195
    :cond_f
    const/4 v13, 0x0

    .line 196
    :goto_1
    and-int/lit16 v3, v2, 0x6000

    .line 197
    .line 198
    if-eqz v3, :cond_11

    .line 199
    .line 200
    invoke-interface {v4, v13}, Lj2/o1;->K(Z)V

    .line 201
    .line 202
    .line 203
    iget-boolean v3, v1, Lq1/i0;->n:Z

    .line 204
    .line 205
    if-eqz v3, :cond_10

    .line 206
    .line 207
    iget-object v3, v1, Lq1/i0;->m:Lq1/l0;

    .line 208
    .line 209
    if-ne v3, v9, :cond_10

    .line 210
    .line 211
    const/4 v3, 0x1

    .line 212
    goto :goto_2

    .line 213
    :cond_10
    const/4 v3, 0x0

    .line 214
    :goto_2
    invoke-interface {v4, v3}, Lj2/o1;->w(Z)V

    .line 215
    .line 216
    .line 217
    :cond_11
    const/high16 v3, 0x20000

    .line 218
    .line 219
    and-int/2addr v3, v2

    .line 220
    if-eqz v3, :cond_12

    .line 221
    .line 222
    invoke-interface {v4}, Lj2/o1;->s()V

    .line 223
    .line 224
    .line 225
    :cond_12
    const/high16 v3, 0x40000

    .line 226
    .line 227
    and-int/2addr v3, v2

    .line 228
    if-eqz v3, :cond_13

    .line 229
    .line 230
    invoke-interface {v4}, Lj2/o1;->m()V

    .line 231
    .line 232
    .line 233
    :cond_13
    const/high16 v3, 0x80000

    .line 234
    .line 235
    and-int/2addr v3, v2

    .line 236
    if-eqz v3, :cond_14

    .line 237
    .line 238
    iget v3, v1, Lq1/i0;->r:I

    .line 239
    .line 240
    invoke-interface {v4, v3}, Lj2/o1;->e(I)V

    .line 241
    .line 242
    .line 243
    :cond_14
    const v3, 0x8000

    .line 244
    .line 245
    .line 246
    and-int/2addr v3, v2

    .line 247
    if-eqz v3, :cond_15

    .line 248
    .line 249
    invoke-interface {v4}, Lj2/o1;->G()V

    .line 250
    .line 251
    .line 252
    :cond_15
    iget-object v11, v1, Lq1/i0;->s:Lq1/h0;

    .line 253
    .line 254
    iget v12, v1, Lq1/i0;->d:F

    .line 255
    .line 256
    iget v14, v1, Lq1/i0;->g:F

    .line 257
    .line 258
    iget-wide v9, v1, Lq1/i0;->o:J

    .line 259
    .line 260
    move-wide v15, v9

    .line 261
    iget-object v10, v0, Lj2/o2;->e:Lj2/e2;

    .line 262
    .line 263
    invoke-virtual/range {v10 .. v16}, Lj2/e2;->d(Lq1/h0;FZFJ)Z

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    iget-boolean v9, v6, Lj2/e2;->f:Z

    .line 268
    .line 269
    if-eqz v9, :cond_16

    .line 270
    .line 271
    invoke-virtual {v6}, Lj2/e2;->b()Landroid/graphics/Outline;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    invoke-interface {v4, v9}, Lj2/o1;->C(Landroid/graphics/Outline;)V

    .line 276
    .line 277
    .line 278
    :cond_16
    if-eqz v13, :cond_17

    .line 279
    .line 280
    iget-boolean v6, v6, Lj2/e2;->g:Z

    .line 281
    .line 282
    if-eqz v6, :cond_17

    .line 283
    .line 284
    const/4 v7, 0x1

    .line 285
    :cond_17
    iget-object v6, v0, Lj2/o2;->a:Lj2/v;

    .line 286
    .line 287
    if-ne v5, v7, :cond_1a

    .line 288
    .line 289
    if-eqz v7, :cond_18

    .line 290
    .line 291
    if-eqz v3, :cond_18

    .line 292
    .line 293
    goto :goto_3

    .line 294
    :cond_18
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 295
    .line 296
    const/16 v5, 0x1a

    .line 297
    .line 298
    if-lt v3, v5, :cond_19

    .line 299
    .line 300
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    if-eqz v3, :cond_1b

    .line 305
    .line 306
    invoke-static {v3, v6, v6}, Lb7/l;->u(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;)V

    .line 307
    .line 308
    .line 309
    goto :goto_4

    .line 310
    :cond_19
    invoke-virtual {v6}, Landroid/view/View;->invalidate()V

    .line 311
    .line 312
    .line 313
    goto :goto_4

    .line 314
    :cond_1a
    :goto_3
    iget-boolean v3, v0, Lj2/o2;->d:Z

    .line 315
    .line 316
    if-nez v3, :cond_1b

    .line 317
    .line 318
    iget-boolean v3, v0, Lj2/o2;->f:Z

    .line 319
    .line 320
    if-nez v3, :cond_1b

    .line 321
    .line 322
    invoke-virtual {v6}, Landroid/view/View;->invalidate()V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v8}, Lj2/o2;->l(Z)V

    .line 326
    .line 327
    .line 328
    :cond_1b
    :goto_4
    iget-boolean v3, v0, Lj2/o2;->g:Z

    .line 329
    .line 330
    if-nez v3, :cond_1c

    .line 331
    .line 332
    invoke-interface {v4}, Lj2/o1;->N()F

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    const/4 v4, 0x0

    .line 337
    cmpl-float v3, v3, v4

    .line 338
    .line 339
    if-lez v3, :cond_1c

    .line 340
    .line 341
    iget-object v3, v0, Lj2/o2;->c:Lic/a;

    .line 342
    .line 343
    if-eqz v3, :cond_1c

    .line 344
    .line 345
    invoke-interface {v3}, Lic/a;->b()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    :cond_1c
    and-int/lit16 v2, v2, 0x1f1b

    .line 349
    .line 350
    if-eqz v2, :cond_1d

    .line 351
    .line 352
    iget-object v2, v0, Lj2/o2;->i:Lc2/d;

    .line 353
    .line 354
    invoke-virtual {v2}, Lc2/d;->e()V

    .line 355
    .line 356
    .line 357
    :cond_1d
    iget v1, v1, Lq1/i0;->a:I

    .line 358
    .line 359
    iput v1, v0, Lj2/o2;->m:I

    .line 360
    .line 361
    return-void
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
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method

.method public final i(J)V
    .locals 7

    .line 1
    iget-object v0, p0, Lj2/o2;->l:Lj2/o1;

    .line 2
    .line 3
    invoke-interface {v0}, Lj2/o1;->u()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0}, Lj2/o1;->F()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/16 v3, 0x20

    .line 12
    .line 13
    shr-long v3, p1, v3

    .line 14
    .line 15
    long-to-int v4, v3

    .line 16
    const-wide v5, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr p1, v5

    .line 22
    long-to-int p2, p1

    .line 23
    if-ne v1, v4, :cond_1

    .line 24
    .line 25
    if-eq v2, p2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    :goto_0
    if-eq v1, v4, :cond_2

    .line 30
    .line 31
    sub-int/2addr v4, v1

    .line 32
    invoke-interface {v0, v4}, Lj2/o1;->q(I)V

    .line 33
    .line 34
    .line 35
    :cond_2
    if-eq v2, p2, :cond_3

    .line 36
    .line 37
    sub-int/2addr p2, v2

    .line 38
    invoke-interface {v0, p2}, Lj2/o1;->A(I)V

    .line 39
    .line 40
    .line 41
    :cond_3
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 42
    .line 43
    const/16 p2, 0x1a

    .line 44
    .line 45
    iget-object v0, p0, Lj2/o2;->a:Lj2/v;

    .line 46
    .line 47
    if-lt p1, p2, :cond_4

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-eqz p1, :cond_5

    .line 54
    .line 55
    invoke-static {p1, v0, v0}, Lb7/l;->u(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 60
    .line 61
    .line 62
    :cond_5
    :goto_1
    iget-object p1, p0, Lj2/o2;->i:Lc2/d;

    .line 63
    .line 64
    invoke-virtual {p1}, Lc2/d;->e()V

    .line 65
    .line 66
    .line 67
    return-void
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

.method public final invalidate()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lj2/o2;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lj2/o2;->f:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lj2/o2;->a:Lj2/v;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, v0}, Lj2/o2;->l(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
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

.method public final j()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lj2/o2;->d:Z

    .line 2
    .line 3
    iget-object v1, p0, Lj2/o2;->l:Lj2/o1;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-interface {v1}, Lj2/o1;->i()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    :goto_0
    invoke-interface {v1}, Lj2/o1;->J()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lj2/o2;->e:Lj2/e2;

    .line 22
    .line 23
    iget-boolean v2, v0, Lj2/e2;->g:Z

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Lj2/e2;->e()V

    .line 28
    .line 29
    .line 30
    iget-object v0, v0, Lj2/e2;->e:Lq1/e0;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    const/4 v0, 0x0

    .line 34
    :goto_1
    iget-object v2, p0, Lj2/o2;->b:Lic/n;

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    new-instance v3, Lj2/n2;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-direct {v3, v4, v2}, Lj2/n2;-><init>(ILic/n;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lj2/o2;->j:Lq1/p;

    .line 45
    .line 46
    invoke-interface {v1, v2, v0, v3}, Lj2/o1;->B(Lq1/p;Lq1/e0;Lj2/n2;)V

    .line 47
    .line 48
    .line 49
    :cond_3
    const/4 v0, 0x0

    .line 50
    invoke-virtual {p0, v0}, Lj2/o2;->l(Z)V

    .line 51
    .line 52
    .line 53
    return-void
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

.method public final k(Lp1/a;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj2/o2;->l:Lj2/o1;

    .line 2
    .line 3
    iget-object v1, p0, Lj2/o2;->i:Lc2/d;

    .line 4
    .line 5
    if-eqz p2, :cond_1

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lc2/d;->b(Ljava/lang/Object;)[F

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    iput p2, p1, Lp1/a;->a:F

    .line 15
    .line 16
    iput p2, p1, Lp1/a;->b:F

    .line 17
    .line 18
    iput p2, p1, Lp1/a;->c:F

    .line 19
    .line 20
    iput p2, p1, Lp1/a;->d:F

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-boolean v0, v1, Lc2/d;->d:Z

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-static {p2, p1}, Lq1/a0;->c([FLp1/a;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-virtual {v1, v0}, Lc2/d;->c(Ljava/lang/Object;)[F

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iget-boolean v0, v1, Lc2/d;->d:Z

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    invoke-static {p2, p1}, Lq1/a0;->c([FLp1/a;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    return-void
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

.method public final l(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lj2/o2;->d:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lj2/o2;->d:Z

    .line 6
    .line 7
    iget-object v0, p0, Lj2/o2;->a:Lj2/v;

    .line 8
    .line 9
    invoke-virtual {v0, p0, p1}, Lj2/v;->A(Li2/o1;Z)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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
