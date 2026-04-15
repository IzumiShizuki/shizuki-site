.class public final Lv0/l0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lu/o0;


# instance fields
.field public final a:Lic/a;

.field public final b:Loc/a;

.field public final c:Lx0/a1;

.field public d:Lic/k;

.field public final e:[F

.field public final f:Lx0/b1;

.field public g:Z

.field public final h:Lx0/a1;

.field public final i:Lx0/e1;

.field public final j:Lr2/a;

.field public final k:Lx0/a1;

.field public final l:Lx0/a1;

.field public final m:Lm0/v;

.field public final n:Ls/y0;


# direct methods
.method public constructor <init>(FLic/a;Loc/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lv0/l0;->a:Lic/a;

    .line 5
    .line 6
    iput-object p3, p0, Lv0/l0;->b:Loc/a;

    .line 7
    .line 8
    new-instance p2, Lx0/a1;

    .line 9
    .line 10
    invoke-direct {p2, p1}, Lx0/a1;-><init>(F)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lv0/l0;->c:Lx0/a1;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    new-array v0, p2, [F

    .line 17
    .line 18
    iput-object v0, p0, Lv0/l0;->e:[F

    .line 19
    .line 20
    new-instance v0, Lx0/b1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lx0/b1;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lv0/l0;->f:Lx0/b1;

    .line 26
    .line 27
    new-instance p2, Lx0/a1;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-direct {p2, v0}, Lx0/a1;-><init>(F)V

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, Lv0/l0;->h:Lx0/a1;

    .line 34
    .line 35
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-static {p2}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iput-object p2, p0, Lv0/l0;->i:Lx0/e1;

    .line 42
    .line 43
    new-instance p2, Lr2/a;

    .line 44
    .line 45
    const/16 v1, 0xa

    .line 46
    .line 47
    invoke-direct {p2, v1, p0}, Lr2/a;-><init>(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput-object p2, p0, Lv0/l0;->j:Lr2/a;

    .line 51
    .line 52
    iget p2, p3, Loc/a;->a:F

    .line 53
    .line 54
    iget p3, p3, Loc/a;->b:F

    .line 55
    .line 56
    sub-float/2addr p3, p2

    .line 57
    cmpg-float v1, p3, v0

    .line 58
    .line 59
    if-nez v1, :cond_0

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    sub-float/2addr p1, p2

    .line 64
    div-float/2addr p1, p3

    .line 65
    :goto_0
    const/high16 p2, 0x3f800000    # 1.0f

    .line 66
    .line 67
    invoke-static {p1, v0, p2}, Lnh/b;->j(FFF)F

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-static {v0, v0, p1}, Landroid/support/v4/media/session/b;->L(FFF)F

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    new-instance p2, Lx0/a1;

    .line 76
    .line 77
    invoke-direct {p2, p1}, Lx0/a1;-><init>(F)V

    .line 78
    .line 79
    .line 80
    iput-object p2, p0, Lv0/l0;->k:Lx0/a1;

    .line 81
    .line 82
    new-instance p1, Lx0/a1;

    .line 83
    .line 84
    invoke-direct {p1, v0}, Lx0/a1;-><init>(F)V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, Lv0/l0;->l:Lx0/a1;

    .line 88
    .line 89
    new-instance p1, Lm0/v;

    .line 90
    .line 91
    const/4 p2, 0x3

    .line 92
    invoke-direct {p1, p2, p0}, Lm0/v;-><init>(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Lv0/l0;->m:Lm0/v;

    .line 96
    .line 97
    new-instance p1, Ls/y0;

    .line 98
    .line 99
    invoke-direct {p1}, Ls/y0;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object p1, p0, Lv0/l0;->n:Ls/y0;

    .line 103
    .line 104
    return-void
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
.method public final a(F)V
    .locals 6

    .line 1
    iget-object v0, p0, Lv0/l0;->f:Lx0/b1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/b1;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    iget-object v1, p0, Lv0/l0;->h:Lx0/a1;

    .line 9
    .line 10
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x2

    .line 15
    int-to-float v3, v3

    .line 16
    div-float/2addr v2, v3

    .line 17
    sub-float/2addr v0, v2

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    div-float/2addr v1, v3

    .line 28
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget-object v3, p0, Lv0/l0;->k:Lx0/a1;

    .line 33
    .line 34
    invoke-virtual {v3}, Lx0/a1;->e()F

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    add-float/2addr v4, p1

    .line 39
    iget-object p1, p0, Lv0/l0;->l:Lx0/a1;

    .line 40
    .line 41
    invoke-virtual {p1}, Lx0/a1;->e()F

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    add-float/2addr v5, v4

    .line 46
    invoke-virtual {v3, v5}, Lx0/a1;->f(F)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v2}, Lx0/a1;->f(F)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Lx0/a1;->e()F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iget-object v3, p0, Lv0/l0;->e:[F

    .line 57
    .line 58
    invoke-static {p1, v1, v0, v3}, Lv0/k0;->e(FFF[F)F

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    iget-object v3, p0, Lv0/l0;->b:Loc/a;

    .line 63
    .line 64
    iget v4, v3, Loc/a;->a:F

    .line 65
    .line 66
    iget v3, v3, Loc/a;->b:F

    .line 67
    .line 68
    sub-float/2addr v0, v1

    .line 69
    cmpg-float v5, v0, v2

    .line 70
    .line 71
    if-nez v5, :cond_0

    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    sub-float/2addr p1, v1

    .line 76
    div-float/2addr p1, v0

    .line 77
    :goto_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 78
    .line 79
    invoke-static {p1, v2, v0}, Lnh/b;->j(FFF)F

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-static {v4, v3, p1}, Landroid/support/v4/media/session/b;->L(FFF)F

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    iget-object v0, p0, Lv0/l0;->c:Lx0/a1;

    .line 88
    .line 89
    invoke-virtual {v0}, Lx0/a1;->e()F

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    cmpg-float v0, p1, v0

    .line 94
    .line 95
    if-nez v0, :cond_1

    .line 96
    .line 97
    return-void

    .line 98
    :cond_1
    iget-object v0, p0, Lv0/l0;->d:Lic/k;

    .line 99
    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-interface {v0, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_2
    invoke-virtual {p0, p1}, Lv0/l0;->c(F)V

    .line 111
    .line 112
    .line 113
    return-void
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
.end method

.method public final b()F
    .locals 5

    .line 1
    iget-object v0, p0, Lv0/l0;->b:Loc/a;

    .line 2
    .line 3
    iget v1, v0, Loc/a;->a:F

    .line 4
    .line 5
    iget v0, v0, Loc/a;->b:F

    .line 6
    .line 7
    iget-object v2, p0, Lv0/l0;->c:Lx0/a1;

    .line 8
    .line 9
    invoke-virtual {v2}, Lx0/a1;->e()F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v2, v1, v0}, Lnh/b;->j(FFF)F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sub-float/2addr v0, v1

    .line 18
    const/4 v3, 0x0

    .line 19
    cmpg-float v4, v0, v3

    .line 20
    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sub-float/2addr v2, v1

    .line 26
    div-float/2addr v2, v0

    .line 27
    :goto_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 28
    .line 29
    invoke-static {v2, v3, v0}, Lnh/b;->j(FFF)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0
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

.method public final c(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lv0/l0;->b:Loc/a;

    .line 2
    .line 3
    iget v1, v0, Loc/a;->a:F

    .line 4
    .line 5
    iget v0, v0, Loc/a;->b:F

    .line 6
    .line 7
    invoke-static {p1, v1, v0}, Lnh/b;->j(FFF)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v2, p0, Lv0/l0;->e:[F

    .line 12
    .line 13
    invoke-static {p1, v1, v0, v2}, Lv0/k0;->e(FFF[F)F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget-object v0, p0, Lv0/l0;->c:Lx0/a1;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lx0/a1;->f(F)V

    .line 20
    .line 21
    .line 22
    return-void
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

.method public final d(Ls/v0;Lic/n;Lyb/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lq/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, p2, v1}, Lq/q;-><init>(Lv0/l0;Ls/v0;Lic/n;Lyb/c;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p3}, Lhf/a0;->k(Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 12
    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    return-object p1
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
