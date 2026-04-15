.class public final Lh0/x;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lh0/u0;


# direct methods
.method public synthetic constructor <init>(Lh0/u0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh0/x;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lh0/x;->c:Lh0/u0;

    .line 4
    .line 5
    const/4 p1, 0x1

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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lh0/x;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ly2/y;

    .line 7
    .line 8
    iget-object v0, p1, Ly2/y;->a:Lt2/g;

    .line 9
    .line 10
    iget-object v0, v0, Lt2/g;->b:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v1, p0, Lh0/x;->c:Lh0/u0;

    .line 13
    .line 14
    iget-object v2, v1, Lh0/u0;->t:Lx0/e1;

    .line 15
    .line 16
    iget-object v3, v1, Lh0/u0;->j:Lt2/g;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iget-object v3, v3, Lt2/g;->b:Ljava/lang/String;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v3, 0x0

    .line 24
    :goto_0
    invoke-static {v0, v3}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    sget-object v0, Lh0/i0;->a:Lh0/i0;

    .line 31
    .line 32
    iget-object v3, v1, Lh0/u0;->k:Lx0/e1;

    .line 33
    .line 34
    invoke-virtual {v3, v0}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {v2, v0}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    iget-object v0, v1, Lh0/u0;->s:Lx0/e1;

    .line 56
    .line 57
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    :goto_1
    sget-wide v2, Lt2/k0;->b:J

    .line 63
    .line 64
    invoke-virtual {v1, v2, v3}, Lh0/u0;->f(J)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2, v3}, Lh0/u0;->e(J)V

    .line 68
    .line 69
    .line 70
    iget-object v0, v1, Lh0/u0;->u:Lic/k;

    .line 71
    .line 72
    invoke-interface {v0, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    iget-object p1, v1, Lh0/u0;->b:Lx0/p1;

    .line 76
    .line 77
    invoke-virtual {p1}, Lx0/p1;->c()V

    .line 78
    .line 79
    .line 80
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 81
    .line 82
    return-object p1

    .line 83
    :pswitch_0
    check-cast p1, Ly2/i;

    .line 84
    .line 85
    iget p1, p1, Ly2/i;->a:I

    .line 86
    .line 87
    iget-object v0, p0, Lh0/x;->c:Lh0/u0;

    .line 88
    .line 89
    iget-object v0, v0, Lh0/u0;->r:Lh0/r0;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    const/4 v2, 0x1

    .line 96
    const/4 v3, 0x5

    .line 97
    const/4 v4, 0x6

    .line 98
    const/4 v5, 0x2

    .line 99
    const/4 v6, 0x7

    .line 100
    if-ne p1, v6, :cond_3

    .line 101
    .line 102
    invoke-virtual {v0}, Lh0/r0;->a()Lh0/s0;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    iget-object v7, v7, Lh0/s0;->a:Lic/k;

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_3
    if-ne p1, v5, :cond_4

    .line 110
    .line 111
    invoke-virtual {v0}, Lh0/r0;->a()Lh0/s0;

    .line 112
    .line 113
    .line 114
    :goto_2
    move-object v7, v1

    .line 115
    goto :goto_4

    .line 116
    :cond_4
    if-ne p1, v4, :cond_5

    .line 117
    .line 118
    invoke-virtual {v0}, Lh0/r0;->a()Lh0/s0;

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    if-ne p1, v3, :cond_6

    .line 123
    .line 124
    invoke-virtual {v0}, Lh0/r0;->a()Lh0/s0;

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_6
    const/4 v7, 0x3

    .line 129
    if-ne p1, v7, :cond_7

    .line 130
    .line 131
    invoke-virtual {v0}, Lh0/r0;->a()Lh0/s0;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    iget-object v7, v7, Lh0/s0;->b:Lic/k;

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_7
    const/4 v7, 0x4

    .line 139
    if-ne p1, v7, :cond_8

    .line 140
    .line 141
    invoke-virtual {v0}, Lh0/r0;->a()Lh0/s0;

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_8
    if-ne p1, v2, :cond_9

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_9
    if-nez p1, :cond_10

    .line 149
    .line 150
    :goto_3
    goto :goto_2

    .line 151
    :goto_4
    sget-object v8, Lub/a0;->a:Lub/a0;

    .line 152
    .line 153
    if-eqz v7, :cond_a

    .line 154
    .line 155
    invoke-interface {v7, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-object v7, v8

    .line 159
    goto :goto_5

    .line 160
    :cond_a
    move-object v7, v1

    .line 161
    :goto_5
    if-nez v7, :cond_f

    .line 162
    .line 163
    const-string v7, "focusManager"

    .line 164
    .line 165
    if-ne p1, v4, :cond_c

    .line 166
    .line 167
    iget-object p1, v0, Lh0/r0;->c:Lo1/i;

    .line 168
    .line 169
    if-eqz p1, :cond_b

    .line 170
    .line 171
    check-cast p1, Lo1/k;

    .line 172
    .line 173
    invoke-virtual {p1, v2}, Lo1/k;->f(I)Z

    .line 174
    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_b
    invoke-static {v7}, Ljc/l;->k(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw v1

    .line 181
    :cond_c
    if-ne p1, v3, :cond_e

    .line 182
    .line 183
    iget-object p1, v0, Lh0/r0;->c:Lo1/i;

    .line 184
    .line 185
    if-eqz p1, :cond_d

    .line 186
    .line 187
    check-cast p1, Lo1/k;

    .line 188
    .line 189
    invoke-virtual {p1, v5}, Lo1/k;->f(I)Z

    .line 190
    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_d
    invoke-static {v7}, Ljc/l;->k(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw v1

    .line 197
    :cond_e
    if-ne p1, v6, :cond_f

    .line 198
    .line 199
    iget-object p1, v0, Lh0/r0;->a:Lj2/u2;

    .line 200
    .line 201
    if-eqz p1, :cond_f

    .line 202
    .line 203
    check-cast p1, Lj2/n1;

    .line 204
    .line 205
    invoke-virtual {p1}, Lj2/n1;->a()V

    .line 206
    .line 207
    .line 208
    :cond_f
    :goto_6
    return-object v8

    .line 209
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 210
    .line 211
    const-string v0, "invalid ImeAction"

    .line 212
    .line 213
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw p1

    .line 217
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 220
    .line 221
    .line 222
    iget-object v0, p0, Lh0/x;->c:Lh0/u0;

    .line 223
    .line 224
    iget-object v0, v0, Lh0/u0;->q:Lx0/e1;

    .line 225
    .line 226
    invoke-virtual {v0, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 230
    .line 231
    return-object p1

    .line 232
    :pswitch_2
    check-cast p1, Lg2/c0;

    .line 233
    .line 234
    iget-object v0, p0, Lh0/x;->c:Lh0/u0;

    .line 235
    .line 236
    invoke-virtual {v0}, Lh0/u0;->d()Lh0/r1;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    if-nez v0, :cond_11

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_11
    iput-object p1, v0, Lh0/r1;->c:Lg2/c0;

    .line 244
    .line 245
    :goto_7
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 246
    .line 247
    return-object p1

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
