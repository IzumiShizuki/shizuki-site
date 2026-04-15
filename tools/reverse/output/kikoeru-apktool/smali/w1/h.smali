.class public final Lw1/h;
.super Lw1/c0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public b:Lq1/m;

.field public c:F

.field public d:Ljava/util/List;

.field public e:F

.field public f:F

.field public g:Lq1/m;

.field public h:I

.field public i:I

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Ls1/h;

.field public final r:Lq1/h;

.field public s:Lq1/h;

.field public final t:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lw1/h;->c:F

    .line 7
    .line 8
    sget v1, Lw1/g0;->a:I

    .line 9
    .line 10
    sget-object v1, Lvb/r;->a:Lvb/r;

    .line 11
    .line 12
    iput-object v1, p0, Lw1/h;->d:Ljava/util/List;

    .line 13
    .line 14
    iput v0, p0, Lw1/h;->e:F

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, p0, Lw1/h;->h:I

    .line 18
    .line 19
    iput v1, p0, Lw1/h;->i:I

    .line 20
    .line 21
    const/high16 v1, 0x40800000    # 4.0f

    .line 22
    .line 23
    iput v1, p0, Lw1/h;->j:F

    .line 24
    .line 25
    iput v0, p0, Lw1/h;->l:F

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Lw1/h;->n:Z

    .line 29
    .line 30
    iput-boolean v0, p0, Lw1/h;->o:Z

    .line 31
    .line 32
    invoke-static {}, Lq1/j;->a()Lq1/h;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lw1/h;->r:Lq1/h;

    .line 37
    .line 38
    iput-object v0, p0, Lw1/h;->s:Lq1/h;

    .line 39
    .line 40
    sget-object v0, Lub/i;->b:Lub/i;

    .line 41
    .line 42
    sget-object v1, Lw1/g;->c:Lw1/g;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lub/a;->c(Lub/i;Lic/a;)Lub/h;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lw1/h;->t:Ljava/lang/Object;

    .line 49
    .line 50
    return-void
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
.method public final a(Ls1/d;)V
    .locals 13

    .line 1
    iget-boolean v0, p0, Lw1/h;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lw1/h;->d:Ljava/util/List;

    .line 6
    .line 7
    iget-object v1, p0, Lw1/h;->r:Lq1/h;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lw1/b;->d(Ljava/util/List;Lq1/e0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lw1/h;->e()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-boolean v0, p0, Lw1/h;->p:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lw1/h;->e()V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, Lw1/h;->n:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lw1/h;->p:Z

    .line 27
    .line 28
    iget-object v3, p0, Lw1/h;->b:Lq1/m;

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    iget-object v2, p0, Lw1/h;->s:Lq1/h;

    .line 33
    .line 34
    iget v4, p0, Lw1/h;->c:F

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    const/16 v6, 0x38

    .line 38
    .line 39
    move-object v1, p1

    .line 40
    invoke-static/range {v1 .. v6}, Lq/t0;->n(Ls1/d;Lq1/e0;Lq1/m;FLs1/h;I)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object v1, p1

    .line 45
    :goto_1
    iget-object v9, p0, Lw1/h;->g:Lq1/m;

    .line 46
    .line 47
    if-eqz v9, :cond_5

    .line 48
    .line 49
    iget-object p1, p0, Lw1/h;->q:Ls1/h;

    .line 50
    .line 51
    iget-boolean v2, p0, Lw1/h;->o:Z

    .line 52
    .line 53
    if-nez v2, :cond_4

    .line 54
    .line 55
    if-nez p1, :cond_3

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    move-object v11, p1

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    :goto_2
    new-instance v3, Ls1/h;

    .line 61
    .line 62
    iget v4, p0, Lw1/h;->f:F

    .line 63
    .line 64
    iget v5, p0, Lw1/h;->j:F

    .line 65
    .line 66
    iget v6, p0, Lw1/h;->h:I

    .line 67
    .line 68
    iget v7, p0, Lw1/h;->i:I

    .line 69
    .line 70
    const/16 v8, 0x10

    .line 71
    .line 72
    invoke-direct/range {v3 .. v8}, Ls1/h;-><init>(FFIII)V

    .line 73
    .line 74
    .line 75
    iput-object v3, p0, Lw1/h;->q:Ls1/h;

    .line 76
    .line 77
    iput-boolean v0, p0, Lw1/h;->o:Z

    .line 78
    .line 79
    move-object v11, v3

    .line 80
    :goto_3
    iget-object v8, p0, Lw1/h;->s:Lq1/h;

    .line 81
    .line 82
    iget v10, p0, Lw1/h;->e:F

    .line 83
    .line 84
    const/16 v12, 0x30

    .line 85
    .line 86
    move-object v7, v1

    .line 87
    invoke-static/range {v7 .. v12}, Lq/t0;->n(Ls1/d;Lq1/e0;Lq1/m;FLs1/h;I)V

    .line 88
    .line 89
    .line 90
    :cond_5
    return-void
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

.method public final e()V
    .locals 7

    .line 1
    iget v0, p0, Lw1/h;->k:F

    .line 2
    .line 3
    iget-object v1, p0, Lw1/h;->r:Lq1/h;

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    cmpg-float v0, v0, v3

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget v0, p0, Lw1/h;->l:F

    .line 13
    .line 14
    cmpg-float v0, v0, v2

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iput-object v1, p0, Lw1/h;->s:Lq1/h;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Lw1/h;->s:Lq1/h;

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v4, 0x0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-static {}, Lq1/j;->a()Lq1/h;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lw1/h;->s:Lq1/h;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iget-object v0, p0, Lw1/h;->s:Lq1/h;

    .line 38
    .line 39
    iget-object v0, v0, Lq1/h;->a:Landroid/graphics/Path;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/graphics/Path;->getFillType()Landroid/graphics/Path$FillType;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v5, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 46
    .line 47
    if-ne v0, v5, :cond_2

    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const/4 v0, 0x0

    .line 52
    :goto_0
    iget-object v5, p0, Lw1/h;->s:Lq1/h;

    .line 53
    .line 54
    iget-object v5, v5, Lq1/h;->a:Landroid/graphics/Path;

    .line 55
    .line 56
    invoke-virtual {v5}, Landroid/graphics/Path;->rewind()V

    .line 57
    .line 58
    .line 59
    iget-object v5, p0, Lw1/h;->s:Lq1/h;

    .line 60
    .line 61
    invoke-virtual {v5, v0}, Lq1/h;->e(I)V

    .line 62
    .line 63
    .line 64
    :goto_1
    iget-object v0, p0, Lw1/h;->t:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    check-cast v5, Lq1/i;

    .line 71
    .line 72
    iget-object v5, v5, Lq1/i;->a:Landroid/graphics/PathMeasure;

    .line 73
    .line 74
    if-eqz v1, :cond_3

    .line 75
    .line 76
    iget-object v1, v1, Lq1/h;->a:Landroid/graphics/Path;

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    const/4 v1, 0x0

    .line 80
    :goto_2
    invoke-virtual {v5, v1, v4}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Lq1/i;

    .line 88
    .line 89
    iget-object v1, v1, Lq1/i;->a:Landroid/graphics/PathMeasure;

    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/graphics/PathMeasure;->getLength()F

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    iget v4, p0, Lw1/h;->k:F

    .line 96
    .line 97
    iget v5, p0, Lw1/h;->m:F

    .line 98
    .line 99
    add-float/2addr v4, v5

    .line 100
    rem-float/2addr v4, v2

    .line 101
    mul-float v4, v4, v1

    .line 102
    .line 103
    iget v6, p0, Lw1/h;->l:F

    .line 104
    .line 105
    add-float/2addr v6, v5

    .line 106
    rem-float/2addr v6, v2

    .line 107
    mul-float v6, v6, v1

    .line 108
    .line 109
    cmpl-float v2, v4, v6

    .line 110
    .line 111
    if-lez v2, :cond_4

    .line 112
    .line 113
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, Lq1/i;

    .line 118
    .line 119
    iget-object v5, p0, Lw1/h;->s:Lq1/h;

    .line 120
    .line 121
    invoke-virtual {v2, v4, v1, v5}, Lq1/i;->a(FFLq1/h;)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Lq1/i;

    .line 129
    .line 130
    iget-object v1, p0, Lw1/h;->s:Lq1/h;

    .line 131
    .line 132
    invoke-virtual {v0, v3, v6, v1}, Lq1/i;->a(FFLq1/h;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_4
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Lq1/i;

    .line 141
    .line 142
    iget-object v1, p0, Lw1/h;->s:Lq1/h;

    .line 143
    .line 144
    invoke-virtual {v0, v4, v6, v1}, Lq1/i;->a(FFLq1/h;)V

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

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/h;->r:Lq1/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
