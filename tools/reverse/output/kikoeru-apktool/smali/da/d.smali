.class public final synthetic Lda/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lda/m0;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lda/m0;JLic/k;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    iput v0, p0, Lda/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/d;->c:Lda/m0;

    iput-wide p2, p0, Lda/d;->d:J

    iput-object p4, p0, Lda/d;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lhf/y;Lda/m0;JI)V
    .locals 0

    .line 2
    iput p5, p0, Lda/d;->a:I

    iput-object p1, p0, Lda/d;->b:Ljava/lang/Object;

    iput-object p2, p0, Lda/d;->c:Lda/m0;

    iput-wide p3, p0, Lda/d;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lda/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lda/d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lic/k;

    .line 9
    .line 10
    iget-object v1, p0, Lda/d;->c:Lda/m0;

    .line 11
    .line 12
    invoke-virtual {v1}, Lda/m0;->A()Lbg/a2;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-static {v2}, Lna/c;->l(Lbg/a2;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-wide v2, p0, Lda/d;->d:J

    .line 24
    .line 25
    invoke-static {v2, v3}, Lna/w;->a(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :goto_0
    const-string v3, "uriCb"

    .line 30
    .line 31
    invoke-static {v0, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Landroidx/lifecycle/m0;->h(Landroidx/lifecycle/s0;)Lk4/a;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v3, Lf9/a;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-direct {v3, v0, v2, v4}, Lf9/a;-><init>(Lic/k;Ljava/lang/String;Lyb/c;)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x3

    .line 45
    invoke-static {v1, v4, v4, v3, v0}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 46
    .line 47
    .line 48
    :goto_1
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_0
    iget-object v0, p0, Lda/d;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lhf/y;

    .line 54
    .line 55
    new-instance v1, Lb9/b;

    .line 56
    .line 57
    const/4 v6, 0x1

    .line 58
    iget-object v2, p0, Lda/d;->c:Lda/m0;

    .line 59
    .line 60
    iget-wide v3, p0, Lda/d;->d:J

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    invoke-direct/range {v1 .. v6}, Lb9/b;-><init>(Ljava/lang/Object;JLyb/c;I)V

    .line 64
    .line 65
    .line 66
    const/4 v2, 0x3

    .line 67
    invoke-static {v0, v5, v5, v1, v2}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :pswitch_1
    iget-object v0, p0, Lda/d;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lhf/y;

    .line 74
    .line 75
    new-instance v1, Lda/y;

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    iget-wide v3, p0, Lda/d;->d:J

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    invoke-direct {v1, v3, v4, v5, v2}, Lda/y;-><init>(JLyb/c;I)V

    .line 82
    .line 83
    .line 84
    const/4 v2, 0x3

    .line 85
    invoke-static {v0, v5, v5, v1, v2}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 86
    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    iget-object v1, p0, Lda/d;->c:Lda/m0;

    .line 90
    .line 91
    invoke-virtual {v1, v0}, Lda/m0;->c0(Z)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :pswitch_2
    iget-object v0, p0, Lda/d;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Lhf/y;

    .line 98
    .line 99
    new-instance v1, Lda/m;

    .line 100
    .line 101
    const/4 v6, 0x2

    .line 102
    iget-object v2, p0, Lda/d;->c:Lda/m0;

    .line 103
    .line 104
    iget-wide v3, p0, Lda/d;->d:J

    .line 105
    .line 106
    const/4 v5, 0x0

    .line 107
    invoke-direct/range {v1 .. v6}, Lda/m;-><init>(Lda/m0;JLyb/c;I)V

    .line 108
    .line 109
    .line 110
    const/4 v3, 0x3

    .line 111
    invoke-static {v0, v5, v5, v1, v3}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 112
    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    invoke-virtual {v2, v0}, Lda/m0;->c0(Z)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :pswitch_3
    iget-object v0, p0, Lda/d;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, Lhf/y;

    .line 122
    .line 123
    new-instance v1, Lda/m;

    .line 124
    .line 125
    const/4 v6, 0x4

    .line 126
    iget-object v2, p0, Lda/d;->c:Lda/m0;

    .line 127
    .line 128
    iget-wide v3, p0, Lda/d;->d:J

    .line 129
    .line 130
    const/4 v5, 0x0

    .line 131
    invoke-direct/range {v1 .. v6}, Lda/m;-><init>(Lda/m0;JLyb/c;I)V

    .line 132
    .line 133
    .line 134
    const/4 v2, 0x3

    .line 135
    invoke-static {v0, v5, v5, v1, v2}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :pswitch_4
    iget-object v0, p0, Lda/d;->b:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, Lhf/y;

    .line 142
    .line 143
    new-instance v1, Lda/m;

    .line 144
    .line 145
    const/4 v6, 0x1

    .line 146
    iget-object v2, p0, Lda/d;->c:Lda/m0;

    .line 147
    .line 148
    iget-wide v3, p0, Lda/d;->d:J

    .line 149
    .line 150
    const/4 v5, 0x0

    .line 151
    invoke-direct/range {v1 .. v6}, Lda/m;-><init>(Lda/m0;JLyb/c;I)V

    .line 152
    .line 153
    .line 154
    const/4 v2, 0x3

    .line 155
    invoke-static {v0, v5, v5, v1, v2}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
