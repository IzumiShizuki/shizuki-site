.class public final Lg2/x;
.super Lu3/v;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lu3/f;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public c:Z

.field public d:I

.field public e:Lu3/w0;

.field public final f:Lo/k0;

.field public final g:Lx0/b1;

.field public final h:Lo/g0;

.field public final i:Lh1/s;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lu3/v;-><init>(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lo/k0;

    .line 6
    .line 7
    const/16 v1, 0x9

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lo/k0;-><init>(I)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lg2/w1;->a:Lg2/v1;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v1, Lg2/v1;->b:Lg2/x1;

    .line 18
    .line 19
    new-instance v2, Lg2/y1;

    .line 20
    .line 21
    const-string v3, "caption bar"

    .line 22
    .line 23
    invoke-direct {v2, v3}, Lg2/y1;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Lo/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sget-object v1, Lg2/v1;->c:Lg2/x1;

    .line 30
    .line 31
    new-instance v2, Lg2/y1;

    .line 32
    .line 33
    const-string v3, "display cutout"

    .line 34
    .line 35
    invoke-direct {v2, v3}, Lg2/y1;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Lo/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object v1, Lg2/v1;->d:Lg2/x1;

    .line 42
    .line 43
    new-instance v2, Lg2/y1;

    .line 44
    .line 45
    const-string v3, "ime"

    .line 46
    .line 47
    invoke-direct {v2, v3}, Lg2/y1;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Lo/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object v1, Lg2/v1;->e:Lg2/x1;

    .line 54
    .line 55
    new-instance v2, Lg2/y1;

    .line 56
    .line 57
    const-string v3, "mandatory system gestures"

    .line 58
    .line 59
    invoke-direct {v2, v3}, Lg2/y1;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Lo/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    sget-object v1, Lg2/v1;->f:Lg2/x1;

    .line 66
    .line 67
    new-instance v2, Lg2/y1;

    .line 68
    .line 69
    const-string v3, "navigation bars"

    .line 70
    .line 71
    invoke-direct {v2, v3}, Lg2/y1;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1, v2}, Lo/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    sget-object v1, Lg2/v1;->g:Lg2/x1;

    .line 78
    .line 79
    new-instance v2, Lg2/y1;

    .line 80
    .line 81
    const-string v3, "status bars"

    .line 82
    .line 83
    invoke-direct {v2, v3}, Lg2/y1;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, Lo/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    sget-object v1, Lg2/v1;->h:Lg2/x1;

    .line 90
    .line 91
    new-instance v2, Lg2/y1;

    .line 92
    .line 93
    const-string v3, "system gestures"

    .line 94
    .line 95
    invoke-direct {v2, v3}, Lg2/y1;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1, v2}, Lo/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    sget-object v1, Lg2/v1;->i:Lg2/x1;

    .line 102
    .line 103
    new-instance v2, Lg2/y1;

    .line 104
    .line 105
    const-string v3, "tappable element"

    .line 106
    .line 107
    invoke-direct {v2, v3}, Lg2/y1;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1, v2}, Lo/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    sget-object v1, Lg2/v1;->j:Lg2/x1;

    .line 114
    .line 115
    new-instance v2, Lg2/y1;

    .line 116
    .line 117
    const-string v3, "waterfall"

    .line 118
    .line 119
    invoke-direct {v2, v3}, Lg2/y1;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1, v2}, Lo/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    iput-object v0, p0, Lg2/x;->f:Lo/k0;

    .line 126
    .line 127
    new-instance v0, Lx0/b1;

    .line 128
    .line 129
    const/4 v1, 0x0

    .line 130
    invoke-direct {v0, v1}, Lx0/b1;-><init>(I)V

    .line 131
    .line 132
    .line 133
    iput-object v0, p0, Lg2/x;->g:Lx0/b1;

    .line 134
    .line 135
    new-instance v0, Lo/g0;

    .line 136
    .line 137
    const/4 v1, 0x4

    .line 138
    invoke-direct {v0, v1}, Lo/g0;-><init>(I)V

    .line 139
    .line 140
    .line 141
    iput-object v0, p0, Lg2/x;->h:Lo/g0;

    .line 142
    .line 143
    new-instance v0, Lh1/s;

    .line 144
    .line 145
    invoke-direct {v0}, Lh1/s;-><init>()V

    .line 146
    .line 147
    .line 148
    iput-object v0, p0, Lg2/x;->i:Lh1/s;

    .line 149
    .line 150
    return-void
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


# virtual methods
.method public final a(Lu3/e0;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lg2/x;->c:Z

    .line 3
    .line 4
    iget-object p1, p1, Lu3/e0;->a:Lu3/d0;

    .line 5
    .line 6
    invoke-virtual {p1}, Lu3/d0;->d()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget v1, p0, Lg2/x;->d:I

    .line 11
    .line 12
    not-int v2, p1

    .line 13
    and-int/2addr v1, v2

    .line 14
    iput v1, p0, Lg2/x;->d:I

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, p0, Lg2/x;->e:Lu3/w0;

    .line 18
    .line 19
    sget-object v1, Landroidx/compose/ui/layout/b;->c:Lo/y;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Lo/m;->b(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lg2/w1;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object v1, p0, Lg2/x;->f:Lo/k0;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    check-cast p1, Lg2/y1;

    .line 39
    .line 40
    iget-object v1, p1, Lg2/y1;->c:Lx0/a1;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-virtual {v1, v2}, Lx0/a1;->f(F)V

    .line 44
    .line 45
    .line 46
    const/high16 v1, 0x3f800000    # 1.0f

    .line 47
    .line 48
    iget-object v3, p1, Lg2/y1;->e:Lx0/a1;

    .line 49
    .line 50
    invoke-virtual {v3, v1}, Lx0/a1;->f(F)V

    .line 51
    .line 52
    .line 53
    const-wide/16 v3, 0x0

    .line 54
    .line 55
    iget-object v1, p1, Lg2/y1;->d:Lx0/c1;

    .line 56
    .line 57
    invoke-virtual {v1, v3, v4}, Lx0/c1;->e(J)V

    .line 58
    .line 59
    .line 60
    iget-object v1, p1, Lg2/y1;->c:Lx0/a1;

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Lx0/a1;->f(F)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p1, Lg2/y1;->b:Lx0/e1;

    .line 66
    .line 67
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const-wide/16 v1, -0x1

    .line 73
    .line 74
    iput-wide v1, p1, Lg2/y1;->j:J

    .line 75
    .line 76
    iput-wide v1, p1, Lg2/y1;->k:J

    .line 77
    .line 78
    iget-object p1, p0, Lg2/x;->g:Lx0/b1;

    .line 79
    .line 80
    invoke-virtual {p1}, Lx0/b1;->e()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    const/4 v2, 0x1

    .line 85
    add-int/2addr v1, v2

    .line 86
    invoke-virtual {p1, v1}, Lx0/b1;->f(I)V

    .line 87
    .line 88
    .line 89
    sget-object p1, Lh1/n;->c:Ljava/lang/Object;

    .line 90
    .line 91
    monitor-enter p1

    .line 92
    :try_start_0
    sget-object v1, Lh1/n;->j:Lh1/b;

    .line 93
    .line 94
    iget-object v1, v1, Lh1/c;->h:Lo/l0;

    .line 95
    .line 96
    if-eqz v1, :cond_0

    .line 97
    .line 98
    invoke-virtual {v1}, Lo/l0;->h()Z

    .line 99
    .line 100
    .line 101
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    if-ne v1, v2, :cond_0

    .line 103
    .line 104
    const/4 v0, 0x1

    .line 105
    :cond_0
    monitor-exit p1

    .line 106
    if-eqz v0, :cond_1

    .line 107
    .line 108
    invoke-static {}, Lh1/n;->a()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :catchall_0
    move-exception v0

    .line 113
    monitor-exit p1

    .line 114
    throw v0

    .line 115
    :cond_1
    return-void
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

.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lg2/x;->c:Z

    .line 3
    .line 4
    return-void
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

.method public final c(Landroid/view/View;Lu3/w0;)Lu3/w0;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lg2/x;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-object p2, p0, Lg2/x;->e:Lu3/w0;

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1e

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :cond_0
    iget p1, p0, Lg2/x;->d:I

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, p2}, Lg2/x;->f(Lu3/w0;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-object p2
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

.method public final d(Lu3/w0;Ljava/util/List;)Lu3/w0;
    .locals 6

    .line 1
    move-object v0, p2

    .line 2
    check-cast v0, Ljava/util/Collection;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lu3/e0;

    .line 16
    .line 17
    iget-object v3, v2, Lu3/e0;->a:Lu3/d0;

    .line 18
    .line 19
    invoke-virtual {v3}, Lu3/d0;->d()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    sget-object v4, Landroidx/compose/ui/layout/b;->c:Lo/y;

    .line 24
    .line 25
    invoke-virtual {v4, v3}, Lo/m;->b(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lg2/w1;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iget-object v4, p0, Lg2/x;->f:Lo/k0;

    .line 34
    .line 35
    invoke-virtual {v4, v3}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    check-cast v3, Lg2/y1;

    .line 43
    .line 44
    iget-object v4, v3, Lg2/y1;->b:Lx0/e1;

    .line 45
    .line 46
    invoke-virtual {v4}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_0

    .line 57
    .line 58
    iget-object v2, v2, Lu3/e0;->a:Lu3/d0;

    .line 59
    .line 60
    invoke-virtual {v2}, Lu3/d0;->c()F

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    iget-object v5, v3, Lg2/y1;->c:Lx0/a1;

    .line 65
    .line 66
    invoke-virtual {v5, v4}, Lx0/a1;->f(F)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Lu3/d0;->a()F

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    iget-object v5, v3, Lg2/y1;->e:Lx0/a1;

    .line 74
    .line 75
    invoke-virtual {v5, v4}, Lx0/a1;->f(F)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lu3/d0;->b()J

    .line 79
    .line 80
    .line 81
    move-result-wide v4

    .line 82
    iget-object v2, v3, Lg2/y1;->d:Lx0/c1;

    .line 83
    .line 84
    invoke-virtual {v2, v4, v5}, Lx0/c1;->e(J)V

    .line 85
    .line 86
    .line 87
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {p0, p1}, Lg2/x;->f(Lu3/w0;)V

    .line 91
    .line 92
    .line 93
    return-object p1
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

.method public final e(Lu3/e0;Lm0/w;)Lm0/w;
    .locals 8

    .line 1
    iget-object v0, p0, Lg2/x;->e:Lu3/w0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lg2/x;->c:Z

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iput-object v2, p0, Lg2/x;->e:Lu3/w0;

    .line 8
    .line 9
    iget-object v2, p1, Lu3/e0;->a:Lu3/d0;

    .line 10
    .line 11
    invoke-virtual {v2}, Lu3/d0;->b()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    cmp-long v6, v2, v4

    .line 18
    .line 19
    if-lez v6, :cond_1

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v2, p1, Lu3/e0;->a:Lu3/d0;

    .line 24
    .line 25
    invoke-virtual {v2}, Lu3/d0;->d()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget v3, p0, Lg2/x;->d:I

    .line 30
    .line 31
    or-int/2addr v3, v2

    .line 32
    iput v3, p0, Lg2/x;->d:I

    .line 33
    .line 34
    sget-object v3, Landroidx/compose/ui/layout/b;->c:Lo/y;

    .line 35
    .line 36
    invoke-virtual {v3, v2}, Lo/m;->b(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lg2/w1;

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    iget-object v4, p0, Lg2/x;->f:Lo/k0;

    .line 45
    .line 46
    invoke-virtual {v4, v3}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    check-cast v3, Lg2/y1;

    .line 54
    .line 55
    iget-object v0, v0, Lu3/w0;->a:Lu3/t0;

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Lu3/t0;->g(I)Lp3/b;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget v2, v0, Lp3/b;->a:I

    .line 62
    .line 63
    int-to-long v4, v2

    .line 64
    const/16 v2, 0x30

    .line 65
    .line 66
    shl-long/2addr v4, v2

    .line 67
    iget v2, v0, Lp3/b;->b:I

    .line 68
    .line 69
    int-to-long v6, v2

    .line 70
    const/16 v2, 0x20

    .line 71
    .line 72
    shl-long/2addr v6, v2

    .line 73
    or-long/2addr v4, v6

    .line 74
    iget v2, v0, Lp3/b;->c:I

    .line 75
    .line 76
    int-to-long v6, v2

    .line 77
    const/16 v2, 0x10

    .line 78
    .line 79
    shl-long/2addr v6, v2

    .line 80
    or-long/2addr v4, v6

    .line 81
    iget v0, v0, Lp3/b;->d:I

    .line 82
    .line 83
    int-to-long v6, v0

    .line 84
    or-long/2addr v4, v6

    .line 85
    iget-wide v6, v3, Lg2/y1;->h:J

    .line 86
    .line 87
    invoke-static {v4, v5, v6, v7}, Lg2/n1;->h(JJ)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_1

    .line 92
    .line 93
    iput-wide v6, v3, Lg2/y1;->j:J

    .line 94
    .line 95
    iput-wide v4, v3, Lg2/y1;->k:J

    .line 96
    .line 97
    iget-object v0, v3, Lg2/y1;->b:Lx0/e1;

    .line 98
    .line 99
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, p1, Lu3/e0;->a:Lu3/d0;

    .line 105
    .line 106
    invoke-virtual {p1}, Lu3/d0;->c()F

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iget-object v2, v3, Lg2/y1;->c:Lx0/a1;

    .line 111
    .line 112
    invoke-virtual {v2, v0}, Lx0/a1;->f(F)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Lu3/d0;->a()F

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    iget-object v2, v3, Lg2/y1;->e:Lx0/a1;

    .line 120
    .line 121
    invoke-virtual {v2, v0}, Lx0/a1;->f(F)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Lu3/d0;->b()J

    .line 125
    .line 126
    .line 127
    move-result-wide v4

    .line 128
    iget-object p1, v3, Lg2/y1;->d:Lx0/c1;

    .line 129
    .line 130
    invoke-virtual {p1, v4, v5}, Lx0/c1;->e(J)V

    .line 131
    .line 132
    .line 133
    iget-object p1, p0, Lg2/x;->g:Lx0/b1;

    .line 134
    .line 135
    invoke-virtual {p1}, Lx0/b1;->e()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    const/4 v2, 0x1

    .line 140
    add-int/2addr v0, v2

    .line 141
    invoke-virtual {p1, v0}, Lx0/b1;->f(I)V

    .line 142
    .line 143
    .line 144
    sget-object p1, Lh1/n;->c:Ljava/lang/Object;

    .line 145
    .line 146
    monitor-enter p1

    .line 147
    :try_start_0
    sget-object v0, Lh1/n;->j:Lh1/b;

    .line 148
    .line 149
    iget-object v0, v0, Lh1/c;->h:Lo/l0;

    .line 150
    .line 151
    if-eqz v0, :cond_0

    .line 152
    .line 153
    invoke-virtual {v0}, Lo/l0;->h()Z

    .line 154
    .line 155
    .line 156
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    if-ne v0, v2, :cond_0

    .line 158
    .line 159
    const/4 v1, 0x1

    .line 160
    :cond_0
    monitor-exit p1

    .line 161
    if-eqz v1, :cond_1

    .line 162
    .line 163
    invoke-static {}, Lh1/n;->a()V

    .line 164
    .line 165
    .line 166
    return-object p2

    .line 167
    :catchall_0
    move-exception p2

    .line 168
    monitor-exit p1

    .line 169
    throw p2

    .line 170
    :cond_1
    return-object p2
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

.method public final f(Lu3/w0;)V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    sget-object v2, Landroidx/compose/ui/layout/b;->a:Lo/y;

    .line 6
    .line 7
    iget-object v3, v2, Lo/m;->b:[I

    .line 8
    .line 9
    iget-object v4, v2, Lo/m;->c:[Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v2, v2, Lo/m;->a:[J

    .line 12
    .line 13
    array-length v5, v2

    .line 14
    add-int/lit8 v5, v5, -0x2

    .line 15
    .line 16
    const-wide/16 v16, 0x80

    .line 17
    .line 18
    const-wide/16 v18, 0xff

    .line 19
    .line 20
    const/16 v8, 0x8

    .line 21
    .line 22
    const/16 v20, 0x0

    .line 23
    .line 24
    if-ltz v5, :cond_4

    .line 25
    .line 26
    const/4 v10, 0x0

    .line 27
    const/16 v21, 0x7

    .line 28
    .line 29
    const/16 v22, 0x0

    .line 30
    .line 31
    const/16 v23, 0x0

    .line 32
    .line 33
    const/16 v24, 0x10

    .line 34
    .line 35
    const/16 v25, 0x20

    .line 36
    .line 37
    :goto_0
    aget-wide v11, v2, v10

    .line 38
    .line 39
    const/16 v26, 0x30

    .line 40
    .line 41
    const-wide v27, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    not-long v13, v11

    .line 47
    shl-long v13, v13, v21

    .line 48
    .line 49
    and-long/2addr v13, v11

    .line 50
    and-long v13, v13, v27

    .line 51
    .line 52
    cmp-long v15, v13, v27

    .line 53
    .line 54
    if-eqz v15, :cond_3

    .line 55
    .line 56
    sub-int v13, v10, v5

    .line 57
    .line 58
    not-int v13, v13

    .line 59
    ushr-int/lit8 v13, v13, 0x1f

    .line 60
    .line 61
    rsub-int/lit8 v13, v13, 0x8

    .line 62
    .line 63
    const/4 v14, 0x0

    .line 64
    :goto_1
    if-ge v14, v13, :cond_2

    .line 65
    .line 66
    and-long v29, v11, v18

    .line 67
    .line 68
    cmp-long v15, v29, v16

    .line 69
    .line 70
    if-gez v15, :cond_0

    .line 71
    .line 72
    shl-int/lit8 v15, v10, 0x3

    .line 73
    .line 74
    add-int/2addr v15, v14

    .line 75
    const/16 v29, 0x1

    .line 76
    .line 77
    aget v9, v3, v15

    .line 78
    .line 79
    aget-object v15, v4, v15

    .line 80
    .line 81
    check-cast v15, Lg2/w1;

    .line 82
    .line 83
    const/16 v30, 0x8

    .line 84
    .line 85
    iget-object v8, v0, Lu3/w0;->a:Lu3/t0;

    .line 86
    .line 87
    invoke-virtual {v8, v9}, Lu3/t0;->g(I)Lp3/b;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    iget v9, v8, Lp3/b;->a:I

    .line 92
    .line 93
    int-to-long v6, v9

    .line 94
    shl-long v6, v6, v26

    .line 95
    .line 96
    iget v9, v8, Lp3/b;->b:I

    .line 97
    .line 98
    move-object/from16 v32, v2

    .line 99
    .line 100
    move-object/from16 v31, v3

    .line 101
    .line 102
    int-to-long v2, v9

    .line 103
    shl-long v2, v2, v25

    .line 104
    .line 105
    or-long/2addr v2, v6

    .line 106
    iget v6, v8, Lp3/b;->c:I

    .line 107
    .line 108
    int-to-long v6, v6

    .line 109
    shl-long v6, v6, v24

    .line 110
    .line 111
    or-long/2addr v2, v6

    .line 112
    iget v6, v8, Lp3/b;->d:I

    .line 113
    .line 114
    int-to-long v6, v6

    .line 115
    or-long/2addr v2, v6

    .line 116
    iget-object v6, v1, Lg2/x;->f:Lo/k0;

    .line 117
    .line 118
    invoke-virtual {v6, v15}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-static {v6}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    check-cast v6, Lg2/y1;

    .line 126
    .line 127
    iget-wide v7, v6, Lg2/y1;->h:J

    .line 128
    .line 129
    invoke-static {v2, v3, v7, v8}, Lg2/n1;->h(JJ)Z

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    if-nez v7, :cond_1

    .line 134
    .line 135
    iput-wide v2, v6, Lg2/y1;->h:J

    .line 136
    .line 137
    const-wide/16 v6, 0x0

    .line 138
    .line 139
    invoke-static {v2, v3, v6, v7}, Lg2/n1;->h(JJ)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    const/16 v22, 0x1

    .line 144
    .line 145
    if-nez v2, :cond_1

    .line 146
    .line 147
    const/16 v23, 0x1

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_0
    move-object/from16 v32, v2

    .line 151
    .line 152
    move-object/from16 v31, v3

    .line 153
    .line 154
    const/16 v29, 0x1

    .line 155
    .line 156
    const/16 v30, 0x8

    .line 157
    .line 158
    :cond_1
    :goto_2
    shr-long v11, v11, v30

    .line 159
    .line 160
    add-int/lit8 v14, v14, 0x1

    .line 161
    .line 162
    move-object/from16 v3, v31

    .line 163
    .line 164
    move-object/from16 v2, v32

    .line 165
    .line 166
    const/16 v8, 0x8

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_2
    move-object/from16 v32, v2

    .line 170
    .line 171
    move-object/from16 v31, v3

    .line 172
    .line 173
    const/16 v2, 0x8

    .line 174
    .line 175
    const/16 v29, 0x1

    .line 176
    .line 177
    if-ne v13, v2, :cond_5

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_3
    move-object/from16 v32, v2

    .line 181
    .line 182
    move-object/from16 v31, v3

    .line 183
    .line 184
    const/16 v29, 0x1

    .line 185
    .line 186
    :goto_3
    if-eq v10, v5, :cond_5

    .line 187
    .line 188
    add-int/lit8 v10, v10, 0x1

    .line 189
    .line 190
    move-object/from16 v3, v31

    .line 191
    .line 192
    move-object/from16 v2, v32

    .line 193
    .line 194
    const/16 v8, 0x8

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_4
    const/16 v21, 0x7

    .line 199
    .line 200
    const/16 v24, 0x10

    .line 201
    .line 202
    const/16 v25, 0x20

    .line 203
    .line 204
    const/16 v26, 0x30

    .line 205
    .line 206
    const-wide v27, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    const/16 v29, 0x1

    .line 212
    .line 213
    const/16 v22, 0x0

    .line 214
    .line 215
    const/16 v23, 0x0

    .line 216
    .line 217
    :cond_5
    sget-object v2, Landroidx/compose/ui/layout/b;->c:Lo/y;

    .line 218
    .line 219
    iget-object v3, v2, Lo/m;->b:[I

    .line 220
    .line 221
    iget-object v4, v2, Lo/m;->c:[Ljava/lang/Object;

    .line 222
    .line 223
    iget-object v2, v2, Lo/m;->a:[J

    .line 224
    .line 225
    array-length v5, v2

    .line 226
    add-int/lit8 v5, v5, -0x2

    .line 227
    .line 228
    if-ltz v5, :cond_b

    .line 229
    .line 230
    const/4 v6, 0x0

    .line 231
    :goto_4
    aget-wide v7, v2, v6

    .line 232
    .line 233
    not-long v9, v7

    .line 234
    shl-long v9, v9, v21

    .line 235
    .line 236
    and-long/2addr v9, v7

    .line 237
    and-long v9, v9, v27

    .line 238
    .line 239
    cmp-long v11, v9, v27

    .line 240
    .line 241
    if-eqz v11, :cond_a

    .line 242
    .line 243
    sub-int v9, v6, v5

    .line 244
    .line 245
    not-int v9, v9

    .line 246
    ushr-int/lit8 v9, v9, 0x1f

    .line 247
    .line 248
    const/16 v30, 0x8

    .line 249
    .line 250
    rsub-int/lit8 v9, v9, 0x8

    .line 251
    .line 252
    const/4 v10, 0x0

    .line 253
    :goto_5
    if-ge v10, v9, :cond_9

    .line 254
    .line 255
    and-long v11, v7, v18

    .line 256
    .line 257
    cmp-long v13, v11, v16

    .line 258
    .line 259
    if-gez v13, :cond_8

    .line 260
    .line 261
    shl-int/lit8 v11, v6, 0x3

    .line 262
    .line 263
    add-int/2addr v11, v10

    .line 264
    aget v12, v3, v11

    .line 265
    .line 266
    aget-object v11, v4, v11

    .line 267
    .line 268
    check-cast v11, Lg2/w1;

    .line 269
    .line 270
    iget-object v13, v1, Lg2/x;->f:Lo/k0;

    .line 271
    .line 272
    invoke-virtual {v13, v11}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v11

    .line 276
    invoke-static {v11}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    check-cast v11, Lg2/y1;

    .line 280
    .line 281
    const/16 v13, 0x8

    .line 282
    .line 283
    if-eq v12, v13, :cond_6

    .line 284
    .line 285
    iget-object v13, v0, Lu3/w0;->a:Lu3/t0;

    .line 286
    .line 287
    invoke-virtual {v13, v12}, Lu3/t0;->h(I)Lp3/b;

    .line 288
    .line 289
    .line 290
    move-result-object v13

    .line 291
    iget v14, v13, Lp3/b;->a:I

    .line 292
    .line 293
    int-to-long v14, v14

    .line 294
    shl-long v14, v14, v26

    .line 295
    .line 296
    move-object/from16 v31, v2

    .line 297
    .line 298
    iget v2, v13, Lp3/b;->b:I

    .line 299
    .line 300
    move-object/from16 v32, v3

    .line 301
    .line 302
    int-to-long v2, v2

    .line 303
    shl-long v2, v2, v25

    .line 304
    .line 305
    or-long/2addr v2, v14

    .line 306
    iget v14, v13, Lp3/b;->c:I

    .line 307
    .line 308
    int-to-long v14, v14

    .line 309
    shl-long v14, v14, v24

    .line 310
    .line 311
    or-long/2addr v2, v14

    .line 312
    iget v13, v13, Lp3/b;->d:I

    .line 313
    .line 314
    int-to-long v13, v13

    .line 315
    or-long/2addr v2, v13

    .line 316
    iget-wide v13, v11, Lg2/y1;->i:J

    .line 317
    .line 318
    invoke-static {v13, v14, v2, v3}, Lg2/n1;->h(JJ)Z

    .line 319
    .line 320
    .line 321
    move-result v13

    .line 322
    if-nez v13, :cond_7

    .line 323
    .line 324
    iput-wide v2, v11, Lg2/y1;->i:J

    .line 325
    .line 326
    const-wide/16 v13, 0x0

    .line 327
    .line 328
    invoke-static {v2, v3, v13, v14}, Lg2/n1;->h(JJ)Z

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    const/16 v22, 0x1

    .line 333
    .line 334
    if-nez v2, :cond_7

    .line 335
    .line 336
    const/16 v23, 0x1

    .line 337
    .line 338
    goto :goto_6

    .line 339
    :cond_6
    move-object/from16 v31, v2

    .line 340
    .line 341
    move-object/from16 v32, v3

    .line 342
    .line 343
    :cond_7
    :goto_6
    iget-object v2, v0, Lu3/w0;->a:Lu3/t0;

    .line 344
    .line 345
    invoke-virtual {v2, v12}, Lu3/t0;->q(I)Z

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    iget-object v3, v11, Lg2/y1;->a:Lx0/e1;

    .line 350
    .line 351
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-virtual {v3, v2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    :goto_7
    const/16 v2, 0x8

    .line 359
    .line 360
    goto :goto_8

    .line 361
    :cond_8
    move-object/from16 v31, v2

    .line 362
    .line 363
    move-object/from16 v32, v3

    .line 364
    .line 365
    goto :goto_7

    .line 366
    :goto_8
    shr-long/2addr v7, v2

    .line 367
    add-int/lit8 v10, v10, 0x1

    .line 368
    .line 369
    move-object/from16 v2, v31

    .line 370
    .line 371
    move-object/from16 v3, v32

    .line 372
    .line 373
    goto :goto_5

    .line 374
    :cond_9
    move-object/from16 v31, v2

    .line 375
    .line 376
    move-object/from16 v32, v3

    .line 377
    .line 378
    const/16 v2, 0x8

    .line 379
    .line 380
    if-ne v9, v2, :cond_b

    .line 381
    .line 382
    goto :goto_9

    .line 383
    :cond_a
    move-object/from16 v31, v2

    .line 384
    .line 385
    move-object/from16 v32, v3

    .line 386
    .line 387
    const/16 v2, 0x8

    .line 388
    .line 389
    :goto_9
    if-eq v6, v5, :cond_b

    .line 390
    .line 391
    add-int/lit8 v6, v6, 0x1

    .line 392
    .line 393
    move-object/from16 v2, v31

    .line 394
    .line 395
    move-object/from16 v3, v32

    .line 396
    .line 397
    goto/16 :goto_4

    .line 398
    .line 399
    :cond_b
    iget-object v0, v0, Lu3/w0;->a:Lu3/t0;

    .line 400
    .line 401
    invoke-virtual {v0}, Lu3/t0;->f()Lu3/c;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    if-nez v0, :cond_c

    .line 406
    .line 407
    const-wide/16 v3, 0x0

    .line 408
    .line 409
    goto :goto_a

    .line 410
    :cond_c
    invoke-virtual {v0}, Lu3/c;->a()Lp3/b;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    iget v3, v2, Lp3/b;->a:I

    .line 415
    .line 416
    int-to-long v3, v3

    .line 417
    shl-long v3, v3, v26

    .line 418
    .line 419
    iget v5, v2, Lp3/b;->b:I

    .line 420
    .line 421
    int-to-long v5, v5

    .line 422
    shl-long v5, v5, v25

    .line 423
    .line 424
    or-long/2addr v3, v5

    .line 425
    iget v5, v2, Lp3/b;->c:I

    .line 426
    .line 427
    int-to-long v5, v5

    .line 428
    shl-long v5, v5, v24

    .line 429
    .line 430
    or-long/2addr v3, v5

    .line 431
    iget v2, v2, Lp3/b;->d:I

    .line 432
    .line 433
    int-to-long v5, v2

    .line 434
    or-long/2addr v3, v5

    .line 435
    :goto_a
    iget-object v2, v1, Lg2/x;->f:Lo/k0;

    .line 436
    .line 437
    sget-object v5, Lg2/w1;->a:Lg2/v1;

    .line 438
    .line 439
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    sget-object v5, Lg2/v1;->j:Lg2/x1;

    .line 443
    .line 444
    invoke-virtual {v2, v5}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    check-cast v2, Lg2/y1;

    .line 452
    .line 453
    iget-wide v5, v2, Lg2/y1;->h:J

    .line 454
    .line 455
    invoke-static {v5, v6, v3, v4}, Lg2/n1;->h(JJ)Z

    .line 456
    .line 457
    .line 458
    move-result v5

    .line 459
    if-nez v5, :cond_d

    .line 460
    .line 461
    iput-wide v3, v2, Lg2/y1;->h:J

    .line 462
    .line 463
    iput-wide v3, v2, Lg2/y1;->i:J

    .line 464
    .line 465
    const-wide/16 v6, 0x0

    .line 466
    .line 467
    invoke-static {v3, v4, v6, v7}, Lg2/n1;->h(JJ)Z

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    const/16 v22, 0x1

    .line 472
    .line 473
    if-nez v2, :cond_d

    .line 474
    .line 475
    const/16 v23, 0x1

    .line 476
    .line 477
    :cond_d
    const/16 v2, 0x1c

    .line 478
    .line 479
    if-nez v0, :cond_e

    .line 480
    .line 481
    const-wide/16 v6, 0x0

    .line 482
    .line 483
    goto :goto_f

    .line 484
    :cond_e
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 485
    .line 486
    if-lt v3, v2, :cond_f

    .line 487
    .line 488
    iget-object v4, v0, Lu3/c;->a:Landroid/view/DisplayCutout;

    .line 489
    .line 490
    invoke-static {v4}, Lm3/e;->f(Landroid/view/DisplayCutout;)I

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    goto :goto_b

    .line 495
    :cond_f
    const/4 v4, 0x0

    .line 496
    :goto_b
    if-lt v3, v2, :cond_10

    .line 497
    .line 498
    iget-object v5, v0, Lu3/c;->a:Landroid/view/DisplayCutout;

    .line 499
    .line 500
    invoke-static {v5}, Lm3/e;->h(Landroid/view/DisplayCutout;)I

    .line 501
    .line 502
    .line 503
    move-result v5

    .line 504
    goto :goto_c

    .line 505
    :cond_10
    const/4 v5, 0x0

    .line 506
    :goto_c
    if-lt v3, v2, :cond_11

    .line 507
    .line 508
    iget-object v6, v0, Lu3/c;->a:Landroid/view/DisplayCutout;

    .line 509
    .line 510
    invoke-static {v6}, Lm3/e;->g(Landroid/view/DisplayCutout;)I

    .line 511
    .line 512
    .line 513
    move-result v6

    .line 514
    goto :goto_d

    .line 515
    :cond_11
    const/4 v6, 0x0

    .line 516
    :goto_d
    if-lt v3, v2, :cond_12

    .line 517
    .line 518
    iget-object v3, v0, Lu3/c;->a:Landroid/view/DisplayCutout;

    .line 519
    .line 520
    invoke-static {v3}, Lm3/e;->e(Landroid/view/DisplayCutout;)I

    .line 521
    .line 522
    .line 523
    move-result v3

    .line 524
    goto :goto_e

    .line 525
    :cond_12
    const/4 v3, 0x0

    .line 526
    :goto_e
    int-to-long v7, v4

    .line 527
    shl-long v7, v7, v26

    .line 528
    .line 529
    int-to-long v4, v5

    .line 530
    shl-long v4, v4, v25

    .line 531
    .line 532
    or-long/2addr v4, v7

    .line 533
    int-to-long v6, v6

    .line 534
    shl-long v6, v6, v24

    .line 535
    .line 536
    or-long/2addr v4, v6

    .line 537
    int-to-long v6, v3

    .line 538
    or-long/2addr v6, v4

    .line 539
    :goto_f
    iget-object v3, v1, Lg2/x;->f:Lo/k0;

    .line 540
    .line 541
    sget-object v4, Lg2/v1;->c:Lg2/x1;

    .line 542
    .line 543
    invoke-virtual {v3, v4}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v3

    .line 547
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    check-cast v3, Lg2/y1;

    .line 551
    .line 552
    iget-wide v4, v3, Lg2/y1;->h:J

    .line 553
    .line 554
    invoke-static {v6, v7, v4, v5}, Lg2/n1;->h(JJ)Z

    .line 555
    .line 556
    .line 557
    move-result v4

    .line 558
    if-nez v4, :cond_13

    .line 559
    .line 560
    iput-wide v6, v3, Lg2/y1;->h:J

    .line 561
    .line 562
    iput-wide v6, v3, Lg2/y1;->i:J

    .line 563
    .line 564
    const-wide/16 v13, 0x0

    .line 565
    .line 566
    invoke-static {v6, v7, v13, v14}, Lg2/n1;->h(JJ)Z

    .line 567
    .line 568
    .line 569
    move-result v3

    .line 570
    const/16 v22, 0x1

    .line 571
    .line 572
    if-nez v3, :cond_13

    .line 573
    .line 574
    const/16 v23, 0x1

    .line 575
    .line 576
    :cond_13
    if-nez v0, :cond_14

    .line 577
    .line 578
    iget-object v0, v1, Lg2/x;->h:Lo/g0;

    .line 579
    .line 580
    iget v2, v0, Lo/g0;->b:I

    .line 581
    .line 582
    if-lez v2, :cond_1a

    .line 583
    .line 584
    invoke-virtual {v0}, Lo/g0;->c()V

    .line 585
    .line 586
    .line 587
    iget-object v0, v1, Lg2/x;->i:Lh1/s;

    .line 588
    .line 589
    invoke-virtual {v0}, Lh1/s;->clear()V

    .line 590
    .line 591
    .line 592
    const/16 v22, 0x1

    .line 593
    .line 594
    goto/16 :goto_14

    .line 595
    .line 596
    :cond_14
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 597
    .line 598
    if-lt v3, v2, :cond_15

    .line 599
    .line 600
    iget-object v0, v0, Lu3/c;->a:Landroid/view/DisplayCutout;

    .line 601
    .line 602
    invoke-static {v0}, Lm3/e;->b(Landroid/view/DisplayCutout;)Ljava/util/List;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    goto :goto_10

    .line 607
    :cond_15
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 608
    .line 609
    :goto_10
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 610
    .line 611
    .line 612
    move-result v2

    .line 613
    iget-object v3, v1, Lg2/x;->h:Lo/g0;

    .line 614
    .line 615
    iget v4, v3, Lo/g0;->b:I

    .line 616
    .line 617
    if-ge v2, v4, :cond_16

    .line 618
    .line 619
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 620
    .line 621
    .line 622
    move-result v2

    .line 623
    iget-object v4, v1, Lg2/x;->h:Lo/g0;

    .line 624
    .line 625
    iget v4, v4, Lo/g0;->b:I

    .line 626
    .line 627
    invoke-virtual {v3, v2, v4}, Lo/g0;->k(II)V

    .line 628
    .line 629
    .line 630
    iget-object v2, v1, Lg2/x;->i:Lh1/s;

    .line 631
    .line 632
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 633
    .line 634
    .line 635
    move-result v3

    .line 636
    iget-object v4, v1, Lg2/x;->i:Lh1/s;

    .line 637
    .line 638
    invoke-virtual {v4}, Lh1/s;->size()I

    .line 639
    .line 640
    .line 641
    move-result v4

    .line 642
    invoke-virtual {v2, v3, v4}, Lh1/s;->k(II)V

    .line 643
    .line 644
    .line 645
    const/16 v22, 0x1

    .line 646
    .line 647
    goto :goto_12

    .line 648
    :cond_16
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 649
    .line 650
    .line 651
    move-result v2

    .line 652
    iget-object v3, v1, Lg2/x;->h:Lo/g0;

    .line 653
    .line 654
    iget v3, v3, Lo/g0;->b:I

    .line 655
    .line 656
    sub-int/2addr v2, v3

    .line 657
    const/4 v3, 0x0

    .line 658
    :goto_11
    if-ge v3, v2, :cond_17

    .line 659
    .line 660
    iget-object v4, v1, Lg2/x;->h:Lo/g0;

    .line 661
    .line 662
    iget v5, v4, Lo/g0;->b:I

    .line 663
    .line 664
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v5

    .line 668
    invoke-static {v5}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 669
    .line 670
    .line 671
    move-result-object v5

    .line 672
    invoke-virtual {v4, v5}, Lo/g0;->a(Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    iget-object v4, v1, Lg2/x;->i:Lh1/s;

    .line 676
    .line 677
    new-instance v5, Ljava/lang/StringBuilder;

    .line 678
    .line 679
    const-string v6, "display cutout rect "

    .line 680
    .line 681
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 682
    .line 683
    .line 684
    iget-object v6, v1, Lg2/x;->h:Lo/g0;

    .line 685
    .line 686
    iget v6, v6, Lo/g0;->b:I

    .line 687
    .line 688
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v5

    .line 695
    new-instance v6, Lg2/w;

    .line 696
    .line 697
    invoke-direct {v6, v5}, Lg2/w;-><init>(Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v4, v6}, Lh1/s;->add(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    add-int/lit8 v3, v3, 0x1

    .line 704
    .line 705
    const/16 v22, 0x1

    .line 706
    .line 707
    goto :goto_11

    .line 708
    :cond_17
    :goto_12
    move-object v2, v0

    .line 709
    check-cast v2, Ljava/util/Collection;

    .line 710
    .line 711
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 712
    .line 713
    .line 714
    move-result v3

    .line 715
    const/4 v4, 0x0

    .line 716
    :goto_13
    if-ge v4, v3, :cond_19

    .line 717
    .line 718
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v5

    .line 722
    check-cast v5, Landroid/graphics/Rect;

    .line 723
    .line 724
    iget-object v6, v1, Lg2/x;->h:Lo/g0;

    .line 725
    .line 726
    invoke-virtual {v6, v4}, Lo/g0;->e(I)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v6

    .line 730
    check-cast v6, Lx0/w0;

    .line 731
    .line 732
    invoke-interface {v6}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v7

    .line 736
    invoke-static {v7, v5}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 737
    .line 738
    .line 739
    move-result v7

    .line 740
    if-nez v7, :cond_18

    .line 741
    .line 742
    invoke-interface {v6, v5}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    const/16 v22, 0x1

    .line 746
    .line 747
    :cond_18
    add-int/lit8 v4, v4, 0x1

    .line 748
    .line 749
    goto :goto_13

    .line 750
    :cond_19
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 751
    .line 752
    .line 753
    move-result v0

    .line 754
    if-nez v0, :cond_1a

    .line 755
    .line 756
    const/16 v23, 0x1

    .line 757
    .line 758
    :cond_1a
    :goto_14
    if-nez v23, :cond_1b

    .line 759
    .line 760
    iget-object v0, v1, Lg2/x;->g:Lx0/b1;

    .line 761
    .line 762
    invoke-virtual {v0}, Lx0/b1;->e()I

    .line 763
    .line 764
    .line 765
    move-result v0

    .line 766
    if-eqz v0, :cond_1d

    .line 767
    .line 768
    :cond_1b
    if-eqz v22, :cond_1d

    .line 769
    .line 770
    iget-object v0, v1, Lg2/x;->g:Lx0/b1;

    .line 771
    .line 772
    invoke-virtual {v0}, Lx0/b1;->e()I

    .line 773
    .line 774
    .line 775
    move-result v2

    .line 776
    add-int/lit8 v2, v2, 0x1

    .line 777
    .line 778
    invoke-virtual {v0, v2}, Lx0/b1;->f(I)V

    .line 779
    .line 780
    .line 781
    sget-object v2, Lh1/n;->c:Ljava/lang/Object;

    .line 782
    .line 783
    monitor-enter v2

    .line 784
    :try_start_0
    sget-object v0, Lh1/n;->j:Lh1/b;

    .line 785
    .line 786
    iget-object v0, v0, Lh1/c;->h:Lo/l0;

    .line 787
    .line 788
    if-eqz v0, :cond_1c

    .line 789
    .line 790
    invoke-virtual {v0}, Lo/l0;->h()Z

    .line 791
    .line 792
    .line 793
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 794
    const/4 v3, 0x1

    .line 795
    if-ne v0, v3, :cond_1c

    .line 796
    .line 797
    const/4 v9, 0x1

    .line 798
    goto :goto_15

    .line 799
    :cond_1c
    const/4 v9, 0x0

    .line 800
    :goto_15
    monitor-exit v2

    .line 801
    if-eqz v9, :cond_1d

    .line 802
    .line 803
    invoke-static {}, Lh1/n;->a()V

    .line 804
    .line 805
    .line 806
    return-void

    .line 807
    :catchall_0
    move-exception v0

    .line 808
    monitor-exit v2

    .line 809
    throw v0

    .line 810
    :cond_1d
    return-void
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

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/View;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/view/View;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move-object p1, v0

    .line 17
    :goto_1
    sget-object v0, Lu3/s;->a:Ljava/lang/reflect/Field;

    .line 18
    .line 19
    invoke-static {p1, p0}, Lu3/l;->c(Landroid/view/View;Lu3/f;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p0}, Lu3/s;->c(Landroid/view/View;Lu3/v;)V

    .line 23
    .line 24
    .line 25
    return-void
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

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/View;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Landroid/view/View;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move-object p1, v0

    .line 18
    :goto_1
    sget-object v0, Lu3/s;->a:Ljava/lang/reflect/Field;

    .line 19
    .line 20
    invoke-static {p1, v2}, Lu3/l;->c(Landroid/view/View;Lu3/f;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v2}, Lu3/s;->c(Landroid/view/View;Lu3/v;)V

    .line 24
    .line 25
    .line 26
    return-void
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

.method public final run()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lg2/x;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lg2/x;->d:I

    .line 7
    .line 8
    iput-boolean v0, p0, Lg2/x;->c:Z

    .line 9
    .line 10
    iget-object v0, p0, Lg2/x;->e:Lu3/w0;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lg2/x;->f(Lu3/w0;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lg2/x;->e:Lu3/w0;

    .line 19
    .line 20
    :cond_0
    return-void
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
