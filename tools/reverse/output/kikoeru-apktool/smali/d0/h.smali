.class public final Ld0/h;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ld0/h;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ld0/h;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final invoke(Lc2/x;Lyb/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Ld0/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ld2/e;

    .line 7
    .line 8
    invoke-direct {v0}, Ld2/e;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v4, Lcg/d0;

    .line 12
    .line 13
    iget-object v1, p0, Ld0/h;->b:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v2, v1

    .line 16
    check-cast v2, Lu/k0;

    .line 17
    .line 18
    const/16 v1, 0x9

    .line 19
    .line 20
    invoke-direct {v4, v1, v2, v0}, Lcg/d0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    new-instance v5, Lcg/b;

    .line 24
    .line 25
    const/16 v1, 0x13

    .line 26
    .line 27
    invoke-direct {v5, v0, p1, v2, v1}, Lcg/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    new-instance v6, Lu/f0;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {v6, v2, v1}, Lu/f0;-><init>(Lu/k0;I)V

    .line 34
    .line 35
    .line 36
    new-instance v7, Lu/f0;

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    invoke-direct {v7, v2, v1}, Lu/f0;-><init>(Lu/k0;I)V

    .line 40
    .line 41
    .line 42
    new-instance v8, Lb0/i0;

    .line 43
    .line 44
    const/16 v1, 0x11

    .line 45
    .line 46
    invoke-direct {v8, v1, v0, v2}, Lb0/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance v1, Lm9/a;

    .line 50
    .line 51
    const/4 v9, 0x0

    .line 52
    move-object v3, p1

    .line 53
    invoke-direct/range {v1 .. v9}, Lm9/a;-><init>(Lu/k0;Lc2/x;Lcg/d0;Lcg/b;Lu/f0;Lu/f0;Lb0/i0;Lyb/c;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1, p2}, Lhf/a0;->k(Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 61
    .line 62
    if-ne p1, p2, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 66
    .line 67
    :goto_0
    return-object p1

    .line 68
    :pswitch_0
    move-object v0, p1

    .line 69
    new-instance p1, Lm0/e3;

    .line 70
    .line 71
    iget-object v1, p0, Ld0/h;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Ls/f;

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    const/4 v3, 0x1

    .line 77
    invoke-direct {p1, v3, v1, v2}, Lm0/e3;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v0, p1, p2}, Lu/w1;->e(Lc2/x;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 85
    .line 86
    if-ne p1, p2, :cond_1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 90
    .line 91
    :goto_1
    return-object p1

    .line 92
    :pswitch_1
    move-object v0, p1

    .line 93
    iget-object p1, p0, Ld0/h;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p1, Ls/d;

    .line 96
    .line 97
    invoke-virtual {p1, v0, p2}, Ls/d;->F0(Lc2/x;Lyb/c;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 102
    .line 103
    if-ne p1, p2, :cond_2

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_2
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 107
    .line 108
    :goto_2
    return-object p1

    .line 109
    :pswitch_2
    move-object v0, p1

    .line 110
    new-instance p1, Ld0/g;

    .line 111
    .line 112
    iget-object v1, p0, Ld0/h;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, Li0/a;

    .line 115
    .line 116
    const/4 v2, 0x0

    .line 117
    const/4 v3, 0x1

    .line 118
    invoke-direct {p1, v3, v1, v2}, Ld0/g;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v0, p1, p2}, Lu/w1;->e(Lc2/x;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 126
    .line 127
    if-ne p1, p2, :cond_3

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_3
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 131
    .line 132
    :goto_3
    return-object p1

    .line 133
    :pswitch_3
    move-object v0, p1

    .line 134
    iget-object p1, p0, Ld0/h;->b:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p1, Lx0/w0;

    .line 137
    .line 138
    new-instance v2, Laa/d;

    .line 139
    .line 140
    const/4 v1, 0x3

    .line 141
    invoke-direct {v2, p1, v1}, Laa/d;-><init>(Lx0/w0;I)V

    .line 142
    .line 143
    .line 144
    const/4 v4, 0x0

    .line 145
    const/16 v6, 0xd

    .line 146
    .line 147
    const/4 v1, 0x0

    .line 148
    const/4 v3, 0x0

    .line 149
    move-object v5, p2

    .line 150
    invoke-static/range {v0 .. v6}, Lu/n2;->f(Lc2/x;Lic/k;Lic/k;Lic/o;Lic/k;Lyb/c;I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 155
    .line 156
    if-ne p1, p2, :cond_4

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_4
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 160
    .line 161
    :goto_4
    return-object p1

    .line 162
    :pswitch_4
    move-object v0, p1

    .line 163
    move-object v5, p2

    .line 164
    new-instance p1, Lba/u0;

    .line 165
    .line 166
    iget-object p2, p0, Ld0/h;->b:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p2, Ld0/d;

    .line 169
    .line 170
    const/4 v1, 0x0

    .line 171
    const/4 v2, 0x2

    .line 172
    invoke-direct {p1, v0, p2, v1, v2}, Lba/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 173
    .line 174
    .line 175
    invoke-static {p1, v5}, Lhf/a0;->k(Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 180
    .line 181
    if-ne p1, p2, :cond_5

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_5
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 185
    .line 186
    :goto_5
    return-object p1

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
