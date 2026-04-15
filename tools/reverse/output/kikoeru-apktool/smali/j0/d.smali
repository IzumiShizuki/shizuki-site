.class public final Lj0/d;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lj0/f;


# direct methods
.method public synthetic constructor <init>(Lj0/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj0/d;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lj0/d;->c:Lj0/f;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
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


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lj0/d;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj0/d;->c:Lj0/f;

    .line 7
    .line 8
    invoke-static {v0}, Li2/f;->u(Li2/m;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    iget-object v0, p0, Lj0/d;->c:Lj0/f;

    .line 15
    .line 16
    iget-object v0, v0, Lj0/f;->x:Ll0/l1;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {v0, v1}, Ll0/l1;->b(Z)Lhf/r1;

    .line 20
    .line 21
    .line 22
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_1
    iget-object v0, p0, Lj0/d;->c:Lj0/f;

    .line 26
    .line 27
    iget-object v0, v0, Lj0/f;->x:Ll0/l1;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-virtual {v0, v1}, Ll0/l1;->f(Z)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_2
    iget-object v0, p0, Lj0/d;->c:Lj0/f;

    .line 37
    .line 38
    iget-object v1, v0, Lj0/f;->s:Lh0/u0;

    .line 39
    .line 40
    iget-object v2, v0, Lj0/f;->z:Lo1/r;

    .line 41
    .line 42
    iget-boolean v0, v0, Lj0/f;->t:Z

    .line 43
    .line 44
    invoke-virtual {v1}, Lh0/u0;->b()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_0

    .line 49
    .line 50
    invoke-static {v2}, Lo1/r;->b(Lo1/r;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    if-nez v0, :cond_1

    .line 55
    .line 56
    iget-object v0, v1, Lh0/u0;->c:Lj2/u2;

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    check-cast v0, Lj2/n1;

    .line 61
    .line 62
    invoke-virtual {v0}, Lj2/n1;->b()V

    .line 63
    .line 64
    .line 65
    :cond_1
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_3
    iget-object v0, p0, Lj0/d;->c:Lj0/f;

    .line 69
    .line 70
    iget-object v1, v0, Lj0/f;->s:Lh0/u0;

    .line 71
    .line 72
    iget-object v1, v1, Lh0/u0;->w:Lh0/x;

    .line 73
    .line 74
    iget-object v0, v0, Lj0/f;->y:Ly2/j;

    .line 75
    .line 76
    iget v0, v0, Ly2/j;->e:I

    .line 77
    .line 78
    new-instance v2, Ly2/i;

    .line 79
    .line 80
    invoke-direct {v2, v0}, Ly2/i;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, Lh0/x;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_4
    iget-object v0, p0, Lj0/d;->c:Lj0/f;

    .line 90
    .line 91
    iget-object v0, v0, Lj0/f;->x:Ll0/l1;

    .line 92
    .line 93
    invoke-virtual {v0}, Ll0/l1;->m()V

    .line 94
    .line 95
    .line 96
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_5
    iget-object v0, p0, Lj0/d;->c:Lj0/f;

    .line 100
    .line 101
    iget-object v0, v0, Lj0/f;->x:Ll0/l1;

    .line 102
    .line 103
    invoke-virtual {v0}, Ll0/l1;->d()V

    .line 104
    .line 105
    .line 106
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_6
    iget-object v0, p0, Lj0/d;->c:Lj0/f;

    .line 110
    .line 111
    invoke-static {v0}, Li2/f;->u(Li2/m;)V

    .line 112
    .line 113
    .line 114
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
