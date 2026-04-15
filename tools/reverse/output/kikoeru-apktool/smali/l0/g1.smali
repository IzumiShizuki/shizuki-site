.class public final Ll0/g1;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public final synthetic g:Z

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll0/l1;ZLyb/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll0/g1;->e:I

    .line 1
    iput-object p1, p0, Ll0/g1;->h:Ljava/lang/Object;

    iput-boolean p2, p0, Ll0/g1;->g:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(ZLm0/x;Lyb/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll0/g1;->e:I

    .line 2
    iput-boolean p1, p0, Ll0/g1;->g:Z

    iput-object p2, p0, Ll0/g1;->h:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 2

    .line 1
    iget p1, p0, Ll0/g1;->e:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ll0/g1;

    .line 7
    .line 8
    iget-object v0, p0, Ll0/g1;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lm0/x;

    .line 11
    .line 12
    iget-boolean v1, p0, Ll0/g1;->g:Z

    .line 13
    .line 14
    invoke-direct {p1, v1, v0, p2}, Ll0/g1;-><init>(ZLm0/x;Lyb/c;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    new-instance p1, Ll0/g1;

    .line 19
    .line 20
    iget-object v0, p0, Ll0/g1;->h:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ll0/l1;

    .line 23
    .line 24
    iget-boolean v1, p0, Ll0/g1;->g:Z

    .line 25
    .line 26
    invoke-direct {p1, v0, v1, p2}, Ll0/g1;-><init>(Ll0/l1;ZLyb/c;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ll0/g1;->e:I

    .line 2
    .line 3
    check-cast p1, Lhf/y;

    .line 4
    .line 5
    check-cast p2, Lyb/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Ll0/g1;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ll0/g1;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ll0/g1;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ll0/g1;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ll0/g1;

    .line 28
    .line 29
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ll0/g1;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ll0/g1;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll0/g1;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lm0/x;

    .line 9
    .line 10
    iget v1, p0, Ll0/g1;->f:I

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v0, Lm0/x;->g:Lx0/e1;

    .line 33
    .line 34
    invoke-virtual {p1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    iget-boolean v1, p0, Ll0/g1;->g:Z

    .line 45
    .line 46
    if-eq v1, p1, :cond_2

    .line 47
    .line 48
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput v2, p0, Ll0/g1;->f:I

    .line 53
    .line 54
    iget-object v1, v0, Lm0/x;->k:Lx0/a1;

    .line 55
    .line 56
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-static {v0, p1, v1, p0}, La/a;->r(Lm0/x;Ljava/lang/Object;FLac/c;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 65
    .line 66
    if-ne p1, v0, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    :goto_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 70
    .line 71
    :goto_1
    return-object v0

    .line 72
    :pswitch_0
    iget-object v0, p0, Ll0/g1;->h:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Ll0/l1;

    .line 75
    .line 76
    iget v1, p0, Ll0/g1;->f:I

    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    sget-object v3, Lub/a0;->a:Lub/a0;

    .line 80
    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    if-ne v1, v2, :cond_3

    .line 84
    .line 85
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 92
    .line 93
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_4
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ll0/l1;->k()Ly2/y;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-wide v4, p1, Ly2/y;->b:J

    .line 105
    .line 106
    invoke-static {v4, v5}, Lt2/k0;->b(J)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    iget-object p1, v0, Ll0/l1;->h:Lj2/g1;

    .line 114
    .line 115
    if-eqz p1, :cond_6

    .line 116
    .line 117
    invoke-virtual {v0}, Ll0/l1;->k()Ly2/y;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-static {v1}, Lud/e;->z(Ly2/y;)Lt2/g;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-static {v1}, Lua/l;->Z(Lt2/g;)Lj2/f1;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    iput v2, p0, Ll0/g1;->f:I

    .line 130
    .line 131
    check-cast p1, Lj2/h;

    .line 132
    .line 133
    invoke-virtual {p1, v1}, Lj2/h;->a(Lj2/f1;)V

    .line 134
    .line 135
    .line 136
    sget-object p1, Lzb/a;->a:Lzb/a;

    .line 137
    .line 138
    if-ne v3, p1, :cond_6

    .line 139
    .line 140
    move-object v3, p1

    .line 141
    goto :goto_3

    .line 142
    :cond_6
    :goto_2
    iget-boolean p1, p0, Ll0/g1;->g:Z

    .line 143
    .line 144
    if-nez p1, :cond_7

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_7
    invoke-virtual {v0}, Ll0/l1;->k()Ly2/y;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iget-wide v1, p1, Ly2/y;->b:J

    .line 152
    .line 153
    invoke-static {v1, v2}, Lt2/k0;->d(J)I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    invoke-virtual {v0}, Ll0/l1;->k()Ly2/y;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    iget-object v1, v1, Ly2/y;->a:Lt2/g;

    .line 162
    .line 163
    invoke-static {p1, p1}, Lt2/c0;->b(II)J

    .line 164
    .line 165
    .line 166
    move-result-wide v4

    .line 167
    invoke-static {v1, v4, v5}, Ll0/l1;->c(Lt2/g;J)Ly2/y;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iget-object v1, v0, Ll0/l1;->c:Lic/k;

    .line 172
    .line 173
    invoke-interface {v1, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    sget-object p1, Lh0/i0;->a:Lh0/i0;

    .line 177
    .line 178
    invoke-virtual {v0, p1}, Ll0/l1;->o(Lh0/i0;)V

    .line 179
    .line 180
    .line 181
    :goto_3
    return-object v3

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
