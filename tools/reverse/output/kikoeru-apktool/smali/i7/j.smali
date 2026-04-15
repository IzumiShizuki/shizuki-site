.class public final Li7/j;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public synthetic g:Ljava/lang/Object;

.field public synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILyb/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Li7/j;->e:I

    invoke-direct {p0, p1, p2}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lm0/w;Lic/n;Lyb/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li7/j;->e:I

    .line 2
    iput-object p1, p0, Li7/j;->g:Ljava/lang/Object;

    check-cast p2, Lac/i;

    iput-object p2, p0, Li7/j;->h:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Li7/j;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lm0/u;

    .line 7
    .line 8
    check-cast p2, Lm0/a4;

    .line 9
    .line 10
    check-cast p3, Lyb/c;

    .line 11
    .line 12
    new-instance p1, Li7/j;

    .line 13
    .line 14
    iget-object p2, p0, Li7/j;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p2, Lm0/w;

    .line 17
    .line 18
    iget-object v0, p0, Li7/j;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lac/i;

    .line 21
    .line 22
    invoke-direct {p1, p2, v0, p3}, Li7/j;-><init>(Lm0/w;Lic/n;Lyb/c;)V

    .line 23
    .line 24
    .line 25
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Li7/j;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :pswitch_0
    check-cast p1, Li7/e0;

    .line 33
    .line 34
    check-cast p2, Li7/e0;

    .line 35
    .line 36
    check-cast p3, Lyb/c;

    .line 37
    .line 38
    new-instance v0, Li7/j;

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    invoke-direct {v0, v1, p3}, Li7/j;-><init>(ILyb/c;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, v0, Li7/j;->g:Ljava/lang/Object;

    .line 45
    .line 46
    iput-object p2, v0, Li7/j;->h:Ljava/lang/Object;

    .line 47
    .line 48
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Li7/j;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Li7/j;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Li7/j;->f:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Li7/j;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lm0/w;

    .line 31
    .line 32
    iget-object p1, p1, Lm0/w;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lm0/v;

    .line 35
    .line 36
    iget-object v0, p0, Li7/j;->h:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lac/i;

    .line 39
    .line 40
    iput v1, p0, Li7/j;->f:I

    .line 41
    .line 42
    invoke-interface {v0, p1, p0}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 47
    .line 48
    if-ne p1, v0, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 52
    .line 53
    :goto_1
    return-object v0

    .line 54
    :pswitch_0
    iget v0, p0, Li7/j;->f:I

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    if-ne v0, v1, :cond_3

    .line 60
    .line 61
    iget-object v0, p0, Li7/j;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Li7/e0;

    .line 64
    .line 65
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1

    .line 77
    :cond_4
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Li7/j;->g:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p1, Li7/e0;

    .line 83
    .line 84
    iget-object v0, p0, Li7/j;->h:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Li7/e0;

    .line 87
    .line 88
    iput-object v0, p0, Li7/j;->g:Ljava/lang/Object;

    .line 89
    .line 90
    iput v1, p0, Li7/j;->f:I

    .line 91
    .line 92
    iget-object p1, p1, Li7/e0;->b:Lch/l;

    .line 93
    .line 94
    iget-object p1, p1, Lch/l;->e:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p1, Lhf/r1;

    .line 97
    .line 98
    const/4 v1, 0x0

    .line 99
    invoke-virtual {p1, v1}, Lhf/k1;->g(Ljava/util/concurrent/CancellationException;)V

    .line 100
    .line 101
    .line 102
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 103
    .line 104
    sget-object v1, Lzb/a;->a:Lzb/a;

    .line 105
    .line 106
    if-ne p1, v1, :cond_5

    .line 107
    .line 108
    move-object v0, v1

    .line 109
    :cond_5
    :goto_2
    return-object v0

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
