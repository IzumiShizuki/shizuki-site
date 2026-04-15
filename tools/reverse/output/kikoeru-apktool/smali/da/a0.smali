.class public final Lda/a0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lda/a0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lda/a0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lda/a0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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


# virtual methods
.method public final invoke(Lc2/x;Lyb/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lda/a0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lh0/x0;

    .line 7
    .line 8
    iget-object v1, p0, Lda/a0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ll0/s0;

    .line 11
    .line 12
    iget-object v2, p0, Lda/a0;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ll0/x;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x1

    .line 18
    invoke-direct {v0, v1, v2, v3, v4}, Lh0/x0;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Lyb/c;I)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0, p2}, Lu/w1;->e(Lc2/x;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 26
    .line 27
    if-ne p1, p2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 31
    .line 32
    :goto_0
    return-object p1

    .line 33
    :pswitch_0
    new-instance v2, Lah/j;

    .line 34
    .line 35
    move-object v0, p1

    .line 36
    check-cast v0, Lc2/j0;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Li2/f;->y(Li2/m;)Li2/j0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v0, v0, Li2/j0;->A:Lj2/z2;

    .line 46
    .line 47
    invoke-direct {v2, v0}, Lah/j;-><init>(Lj2/z2;)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Ld0/g;

    .line 51
    .line 52
    iget-object v1, p0, Lda/a0;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Ll0/l;

    .line 55
    .line 56
    iget-object v3, p0, Lda/a0;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Lh0/c1;

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x2

    .line 62
    invoke-direct/range {v0 .. v5}, Ld0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v0, p2}, Lu/w1;->e(Lc2/x;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 70
    .line 71
    if-ne p1, p2, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 75
    .line 76
    :goto_1
    return-object p1

    .line 77
    :pswitch_1
    new-instance v0, Lh0/e0;

    .line 78
    .line 79
    iget-object v1, p0, Lda/a0;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Lh0/c1;

    .line 82
    .line 83
    iget-object v2, p0, Lda/a0;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, Ll0/l1;

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    invoke-direct {v0, p1, v1, v2, v3}, Lh0/e0;-><init>(Lc2/x;Lh0/c1;Ll0/l1;Lyb/c;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v0, p2}, Lhf/a0;->k(Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 96
    .line 97
    if-ne p1, p2, :cond_2

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 101
    .line 102
    :goto_2
    return-object p1

    .line 103
    :pswitch_2
    iget-object v0, p0, Lda/a0;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Lx0/w0;

    .line 106
    .line 107
    new-instance v3, Laa/d;

    .line 108
    .line 109
    const/4 v1, 0x4

    .line 110
    invoke-direct {v3, v0, v1}, Laa/d;-><init>(Lx0/w0;I)V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lda/a0;->c:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, Lic/a;

    .line 116
    .line 117
    new-instance v5, Lda/z;

    .line 118
    .line 119
    const/4 v1, 0x0

    .line 120
    invoke-direct {v5, v1, v0}, Lda/z;-><init>(ILic/a;)V

    .line 121
    .line 122
    .line 123
    const/4 v7, 0x5

    .line 124
    const/4 v2, 0x0

    .line 125
    const/4 v4, 0x0

    .line 126
    move-object v1, p1

    .line 127
    move-object v6, p2

    .line 128
    invoke-static/range {v1 .. v7}, Lu/n2;->f(Lc2/x;Lic/k;Lic/k;Lic/o;Lic/k;Lyb/c;I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 133
    .line 134
    if-ne p1, p2, :cond_3

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_3
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 138
    .line 139
    :goto_3
    return-object p1

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
